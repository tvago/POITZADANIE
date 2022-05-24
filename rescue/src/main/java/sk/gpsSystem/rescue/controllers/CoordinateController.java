package sk.gpsSystem.rescue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.gpsSystem.rescue.model.Coordinates;
import sk.gpsSystem.rescue.services.CoordinateService;

import java.util.List;

@RestController
@RequestMapping("/api/coordinate")
public class CoordinateController {
    @Autowired
    CoordinateService coordinateService;

    @PostMapping
    private Coordinates saveCoordinate(@RequestBody Coordinates coordinates){
        return coordinateService.saveCoordinates(coordinates);
    }


    @GetMapping("/all")
    private List<Coordinates> getAllCoordinates(){
        return coordinateService.getAll();
    }

}
