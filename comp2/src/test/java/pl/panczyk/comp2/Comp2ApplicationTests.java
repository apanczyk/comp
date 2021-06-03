package pl.panczyk.comp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.panczyk.comp2.model.Location;
import pl.panczyk.comp2.service.LocationService;

@SpringBootTest
class Comp2ApplicationTests {

    @Test
    public void createLocation() {
        int latitiude = 123;
        int longtitude = 123;
        Location location = new Location(latitiude,longtitude);
        Assertions.assertTrue(latitiude == location.getLatitiude() && longtitude == location.getLongitude());
    }

    @Test
    public void changeLocation() {
        LocationService locationService = new LocationService();

        Location location = new Location(123,123);
        locationService.changeLocation(location, 321,321);
        Assertions.assertTrue(location.getLatitiude() == 321 && location.getLongitude() == 321);
    }


}
