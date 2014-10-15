package com.maxpro.travel.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.Repository;

public interface GenericRepository<T, ID extends Serializable> extends Repository<T, ID> {
		  T findOne(ID id);
	  T save(T entity);
	  List<T> findAll();
}
