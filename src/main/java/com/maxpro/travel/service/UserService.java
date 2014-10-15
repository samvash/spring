package com.maxpro.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxpro.travel.domain.SearchResult;
import com.maxpro.travel.domain.User;
import com.maxpro.travel.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User saveSearch(User searchResult)
	{
		return userRepository.save(searchResult);
	}
	
	
	public List<User> getAllSearch()
	{
		return userRepository.findAll();
	}
	
	
	
}
