package com.example.swplanet.domain;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class PlanetService {
    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository){
        this.planetRepository = planetRepository;
    }
    public Planet create(Planet planet){
        return planetRepository.save(planet);
    }
    public Optional<Planet> get (Long id){
        return planetRepository.findById(id);
    }
    public Optional<Planet> getByName (String name){
        return planetRepository.findByName(name);
    }

}
