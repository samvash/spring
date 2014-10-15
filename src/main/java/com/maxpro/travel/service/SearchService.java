package com.maxpro.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maxpro.travel.domain.SearchResult;
import com.maxpro.travel.repository.SearchRepository;

@Service
public class SearchService {

	@Autowired
	SearchRepository searchRepository;
	
	public SearchResult saveSearch(SearchResult searchResult)
	{
		return searchRepository.save(searchResult);
	}
	
	
	public List<SearchResult> getAllSearch()
	{
		return searchRepository.findAll();
	}
	
	
	
}
