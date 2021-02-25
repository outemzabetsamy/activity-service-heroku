package com.sw.activite.controller;

import java.net.URI;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.sw.activite.entity.Activite;
import com.sw.activite.exception.ActivityNotFoundException;
import com.sw.activite.service.ActiviteService;

@RestController
@CrossOrigin
@RequestMapping("/api/activites")
public class ActiviteController {
	private ActiviteService activiteService;
	@Autowired
	public ActiviteController(ActiviteService activiteService){
		this.activiteService=activiteService;
	}
	@GetMapping("/all")
	public List<Activite> getAllActivities() {
		return activiteService.findAllActivities();
		
	}
	@GetMapping("/all/{id}")
	public Activite getActivityById(@PathVariable Long id) {
		return activiteService.findActivityById(id).orElseThrow(()-> new ActivityNotFoundException("Activity with id "+id+"not found"));
	}
	
	@PostMapping(value="/add")
	 
    public ResponseEntity<Void> addActivity(@RequestBody Activite p){
    Activite activiteAdded= activiteService.addActivity(p);
    if(activiteAdded == null){
        return ResponseEntity.noContent().build();
    }
        URI location= ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(activiteAdded.getId()).toUri();

    return ResponseEntity.created(location).build();}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteActivityById(@PathVariable Long id) {
		activiteService.deleteActivityById(id);
	}
	@PutMapping(value="/edit")
	public void editActivity(@RequestBody Activite p) {
		activiteService.editActivity(p);
	}
}




