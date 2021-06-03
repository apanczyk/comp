package pl.panczyk.comp2.controller;

import org.springframework.web.bind.annotation.*;
import pl.panczyk.comp2.model.Location;
import pl.panczyk.comp2.repository.LocationRepository;
import pl.panczyk.comp2.service.LocationService;

import java.util.List;

@RestController()
@RequestMapping(path="api/location")
public class LocationController {

    private final LocationRepository locationRepository;
    private final LocationService locationService;

    public LocationController(LocationRepository locationRepository, LocationService locationService) {
        this.locationRepository = locationRepository;
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @PostMapping("new")
    public void createLocation(@RequestBody Location location) {
        locationRepository.save(location);
    }

    @PostMapping()
    public Location updateLocation(@RequestBody Location location) throws Exception {
        Location currentLocation = locationRepository.findById(location.getDeviceId()).orElseThrow(Exception::new);
        Location newLocation = locationService.changeLocation(currentLocation, location.getLatitiude(), location.getLongitude());
        return locationRepository.save(newLocation);
    }

}
