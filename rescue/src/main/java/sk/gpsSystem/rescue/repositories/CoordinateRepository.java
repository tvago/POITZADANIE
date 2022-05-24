package sk.gpsSystem.rescue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.gpsSystem.rescue.model.Coordinates;

import java.util.List;

public interface CoordinateRepository extends JpaRepository<Coordinates,String> {

}
