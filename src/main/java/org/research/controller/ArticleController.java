package org.research.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.research.beans.Article;
import org.research.services.impl.ArticleServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	
	private static final Logger logger= LogManager.getLogger(ArticleController.class);

    @Autowired
    private ArticleServicesImpl services;
    
    @RequestMapping(value={"/articles"},method=RequestMethod.GET,produces="application/json")
    public @ResponseBody List<Article> getAllArticles(){
    	
    	logger.debug("Getting all the articles");
    	
        return services.getAll();
    }   
    
    @GetMapping("/articles/{id}")
    public ResponseEntity<Article> getArticle(@PathVariable("id") Long id) {
    	
    	logger.debug("Get the article with the given ID");
    	
        return ResponseEntity.ok(services.find(id));
    }

    @PostMapping(value = "/articles")
    public void addNewArticle(@RequestBody Article article){
        services.create(article);
        
        logger.debug("Article created successfully");
    }

    @PutMapping("/articles/{id}")
    public Article update(@PathVariable("id") Long id,@RequestBody Article article) {
        Article articleRest = services.find(id);
        articleRest.setResume(article.getResume());
        articleRest.setTitle(article.getTitle());
        services.update(articleRest);
        
        logger.debug("Update the article information");
        
        return services.find(articleRest.getIdArticle());
    }

    @DeleteMapping("/articles/{id}")
    public void delete(@PathVariable("id") Long id){
        Article article = services.find(id);
        services.delete(article);
        
        logger.debug("Delete the specified article");
    }
	
}
