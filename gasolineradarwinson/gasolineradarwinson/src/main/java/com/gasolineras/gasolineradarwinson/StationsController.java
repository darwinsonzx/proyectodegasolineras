package com.gasolineras.gasolineradarwinson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationsController {
    // create a list of Gas Station objects
//    private List<GasStation> stations = new ArrayList<GasStation>();

    // create a constructor for the StationsController class
    public StationsController() {
//        // add a few GasStation objects to the list
//        stations.add(new GasStation("Shell", "1234 Main St", "123-456-7890"));
//        stations.add(new GasStation("Chevron", "5678 Elm St", "234-567-8901"));
//        stations.add(new GasStation("Exxon", "9101 Oak St", "345-678-9012"));
    }

    // create a method to return the list of GasStation objects
    @GetMapping("/stations")
    public String getStations() {
        return "Hello Wolrd";
    }

//    // create a method to return a specific GasStation object
//    @GetMapping("/stations/{index}")
//    public GasStation getStation(@PathVariable int index) {
//        return stations.get(index);
//    }
//
//    // create a method to add a new GasStation object to the list
//    @PostMapping("/stations")
//    public void addStation(@RequestBody GasStation station) {
//        stations.add(station);
//    }
//
//    // create a method to update an existing GasStation object in the list
}