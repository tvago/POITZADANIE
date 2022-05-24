package sk.gpsSystem.rescue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.gpsSystem.rescue.model.Coordinates;
import sk.gpsSystem.rescue.repositories.CoordinateRepository;

import java.util.List;

@Service
public class CoordinateService {

    @Autowired
    CoordinateRepository coordinateRepository;

    public Coordinates saveCoordinates(Coordinates coordinates){
       return coordinateRepository.save(coordinates);
    }

    public List<Coordinates> getAll(){
        return coordinateRepository.findAll();
    }

}
