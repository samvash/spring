package com.maxpro.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maxpro.travel.domain.SearchResult;
import com.maxpro.travel.service.SearchService;

@Controller
@RequestMapping(value ="/search")
public class SearchController {

	@Autowired
	SearchService searchService;
	
	
	@RequestMapping(value = "/savesearch", method = RequestMethod.POST)
	public String saveSearch(@ModelAttribute("searchResult") SearchResult searchResult ,ModelMap model )
	{
		searchService.saveSearch(searchResult);
		List results = searchService.getAllSearch(); 
		model.addAttribute("results",results);
		return "search";
	}
	
	
}
