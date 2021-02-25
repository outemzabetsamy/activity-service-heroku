package com.sw.activite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.activite.entity.Activite;
import com.sw.activite.repository.ActiviteRepository;
@Service
public class ActiviteService {
private ActiviteRepository activiteRepository;
@Autowired
public ActiviteService(ActiviteRepository activiteRepository) {
	this.activiteRepository=activiteRepository;
}
	public List<Activite> findAllActivities() {
		
		return activiteRepository.findAll();
	}
	public Optional<Activite> findActivityById(Long id) {
		return activiteRepository.findById(id);
	}
	public Activite addActivity(Activite p) {
		
		return activiteRepository.save(p);
	}
	public void deleteActivityById(Long id) {
		activiteRepository.deleteById(id);
		
	}
	public void editActivity(Activite p) {
		activiteRepository.save(p);
		
	}
	

}
