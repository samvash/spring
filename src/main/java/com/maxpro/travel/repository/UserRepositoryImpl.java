package com.maxpro.travel.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.maxpro.travel.domain.SearchResult;
import com.maxpro.travel.domain.User;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	SessionFactory sessionFactory;
	
	public User findOne(Long id) {
		return (User)sessionFactory.getCurrentSession().get(User.class,id);
	}
	
	public User save(User entity) {
		Long idval = (Long) sessionFactory.getCurrentSession().save(entity);
		User user = findOne(idval);
		return user ;
	}

	public List<User> findAll() {
		List<User> result = sessionFactory.getCurrentSession().createCriteria(User.class).list();
		return result;
	}

	
}
