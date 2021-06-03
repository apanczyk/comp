package pl.panczyk.comp2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer latitiude;
    private Integer longitude;

    public Location() {
    }

    public Location(Integer latitiude, Integer longitude) {
        this.latitiude = latitiude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(Integer latitiude) {
        this.latitiude = latitiude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
}
