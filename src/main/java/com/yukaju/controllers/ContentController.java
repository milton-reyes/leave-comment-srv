package com.yukaju.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yukaju.models.Article;
import com.yukaju.services.ContentService;

@RestController
//@RequestMapping("/topics")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.PUT, RequestMethod.PATCH,
		RequestMethod.POST }, allowedHeaders = { "*" })
public class ContentController {
	
	@Autowired
	ContentService contentService;
	
	@GetMapping
	public List<Article> getArticles() {
		return contentService.getArticles();
	}
	
	//@PostMapping("/addarticle")
	@PostMapping
	public Article addArticle(@Valid @RequestBody Article article ) {
		return contentService.addArticle(article);
		
	}

}