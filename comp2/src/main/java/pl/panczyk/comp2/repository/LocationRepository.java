package pl.panczyk.comp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.panczyk.comp2.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
