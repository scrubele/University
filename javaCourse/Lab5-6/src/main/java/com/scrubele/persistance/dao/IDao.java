package com.scrubele.persistance.dao;

public interface IDao<T> {

    T findById(Integer id);

    T add(T object);

    void delete(Integer id);

    T update(T object);

}