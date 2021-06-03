package pl.panczyk.comp2.service;

import org.springframework.stereotype.Service;
import pl.panczyk.comp2.model.Location;

@Service
public class LocationService {

    public Location changeLocation(Location location, Integer latitiude, Integer longitude) {
        location.setLongitude(longitude);
        location.setLatitiude(latitiude);
        return location;
    }
}
