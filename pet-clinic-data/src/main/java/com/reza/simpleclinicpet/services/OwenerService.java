package com.reza.simpleclinicpet.services;

import com.reza.simpleclinicpet.model.Owner;

public interface OwenerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
