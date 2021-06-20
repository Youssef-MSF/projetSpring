package org.research.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.research.beans.Author;
import org.research.services.impl.AuthorServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
	
	private static final Logger logger= LogManager.getLogger(AuthorController.class);

    @Autowired
    private AuthorServicesImpl services;
    
    @RequestMapping(value={"/authors"},method=RequestMethod.GET,produces="application/json")
    public @ResponseBody List<Author> getAllAuthors(){
    	
    	logger.debug("Getting all the authors");
    	
        return services.getAll();
    }   
    
    @GetMapping("/authors/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable("id") Long id) {
    	
    	logger.debug("Get the author with the given ID");
    	
        return ResponseEntity.ok(services.find(id));
    }

    @PostMapping(value = "/authors")
    public void addNewAuthor(@RequestBody Author author){
        services.create(author);
        
        logger.debug("Author created successfully");
    }

    @PutMapping("/authors/{id}")
    public Author update(@PathVariable("id") Long id,@RequestBody Author author) {
        Author authorRest = services.find(id);
        authorRest.setAge(author.getAge());
        authorRest.setAddress(author.getAddress());
        authorRest.setFirstName(author.getFirstName());
        authorRest.setLastName(author.getLastName());
        services.update(authorRest);
        
        logger.debug("Update the author information");
        
        return services.find(authorRest.getIdAuthor());
    }

    @DeleteMapping("/authors/{id}")
    public void delete(@PathVariable("id") Long id){
        Author author = services.find(id);
        services.delete(author);
        
        logger.debug("Delete the specified author");
    }

}
