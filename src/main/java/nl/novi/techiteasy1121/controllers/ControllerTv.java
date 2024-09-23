package nl.novi.techiteasy1121.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.novi.techiteasy1121.dtos.TelevisionDto;
import nl.novi.techiteasy1121.services.TVservice;

@RestController
@RequestMapping("/api/tvs")
public class ControllerTv {

    private final TVservice tvService;

    // Constructor injection is preferred over @Autowired on fields
    @Autowired
    public ControllerTv(TVservice tvService) {
        this.tvService = tvService;
    }

    // Get all TVs
    @GetMapping
    public List<TelevisionDto> getAllTvs() {
        return tvService.getAllTvs();
    }

    // Get a single TV by ID
    @GetMapping("/{id}")
    public ResponseEntity<TelevisionDto> getTvById(@PathVariable long id) {
        return ResponseEntity.ok(tvService.getTv(id));
    }

    // Add a new TV
    @PostMapping
    public ResponseEntity<TelevisionDto> addTv(@RequestBody TelevisionDto televisionDto) {
        return ResponseEntity.ok(tvService.addTv(televisionDto));
    }

    // Update an existing TV
    @PutMapping("/{id}")
    public ResponseEntity<TelevisionDto> updateTv(@RequestBody TelevisionDto televisionDto, @PathVariable long id) {
        return ResponseEntity.ok(tvService.updateTv(televisionDto, id));
    }

    // Delete a TV by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTvById(@PathVariable long id) {
        return tvService.deleteTvById(id);
    }
}
