package com.reza.simpleclinicpet.services;

import com.reza.simpleclinicpet.model.Owner;

import java.util.Set;

public interface OwenerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}