package com.maxpro.travel.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maxpro.travel.domain.SearchResult;

@Component
public class SearchRepositoryImpl implements SearchRepository{

	@Autowired
	SessionFactory sessionFactory;
	
	public SearchResult findOne(Long id) {
		return null;
	}

	public SearchResult save(SearchResult entity) {
		return (SearchResult) sessionFactory.getCurrentSession().save(entity);
	}

	public List<SearchResult> findAll() {
		List<SearchResult> result = sessionFactory.getCurrentSession().createCriteria("select * from SearchResult").list();
		return result;
	}
}
