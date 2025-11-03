package com.detersak.catalogservice.controller;

import com.detersak.catalogservice.entity.Vehicle;
import com.detersak.catalogservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private VehicleService vehicleService;

    @Autowired
    VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public @ResponseBody List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
    @GetMapping("/{id}")
    public @ResponseBody Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }


}
