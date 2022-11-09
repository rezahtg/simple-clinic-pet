package com.reza.simpleclinicpet.services;

import com.reza.simpleclinicpet.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
