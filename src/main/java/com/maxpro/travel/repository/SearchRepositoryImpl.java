package com.maxpro.travel.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.maxpro.travel.domain.SearchResult;

@Repository
@Transactional
public class SearchRepositoryImpl implements SearchRepository{

	@Autowired
	SessionFactory sessionFactory;
	
	public SearchResult findOne(Long id) {
		return (SearchResult)sessionFactory.getCurrentSession().get(SearchResult.class,id);
	}
	
	public SearchResult save(SearchResult entity) {
		Long idval = (Long) sessionFactory.getCurrentSession().save(entity);
		SearchResult searResult = findOne(idval);
		return searResult ;
	}

	public List<SearchResult> findAll() {
		List<SearchResult> result = sessionFactory.getCurrentSession().createCriteria(SearchResult.class).list();
		return result;
	}
}
