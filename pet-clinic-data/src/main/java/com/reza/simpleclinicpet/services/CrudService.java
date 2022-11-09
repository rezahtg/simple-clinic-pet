package com.reza.simpleclinicpet.services;

import java.util.Set;

/**
 * This interface mimicking as CRUD Repository Interface.
 * This Class will be a base class services
 * @param <T>
 * @param <ID>
 */

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
