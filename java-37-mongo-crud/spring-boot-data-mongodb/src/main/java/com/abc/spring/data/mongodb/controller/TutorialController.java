package com.abc.spring.data.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.abc.spring.data.mongodb.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.spring.data.mongodb.model.Tutorial;


// http://localhost:8090/api

// @CrossOrigin(origins = {"http://127.0.0.1:8081", "http://localhost:3000", "http://100.20.55.145:4000"})
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TutorialController {

  @Autowired
  TutorialService tutorialService;


  //GET    http://localhost:8090/api/tutorials
  //GET    http://localhost:8090/api/tutorials?title=abc
  @GetMapping("/tutorials")
  public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
      return tutorialService.getAllTutorials(title);
  }

  //GET    http://localhost:8090/api/tutorials/:id
  @GetMapping("/tutorials/{id}")
  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") String id) {
    return tutorialService.getTutorialById(id);
  }


  //GET    http://localhost:8090/api/tutorials/published
  @GetMapping("/tutorials/published")
  public ResponseEntity<List<Tutorial>> findByPublished() {
    return tutorialService.findByPublished(true);
  }

  // TODO true ve false durumu esnek yapılacak.
  /*
  //GET    http://localhost:8090/api/tutorials/published/:flag
  @GetMapping("/tutorials/published/{flag}")
  public ResponseEntity<List<Tutorial>> findByPublished(@PathVariable("flag") boolean flag) {
    return tutorialService.findByPublished(flag);
  }
*/


  //POST    http://localhost:8090/api/tutorials
  @PostMapping("/tutorials")
  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
   return tutorialService.createTutorial(tutorial);
  }


  //PUT    http://localhost:8090/api/tutorials/:id
  @PutMapping("/tutorials/{id}")
  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") String id, @RequestBody Tutorial tutorial) {
    return tutorialService.updateTutorial(id, tutorial);
  }


  //DELETE    http://localhost:8090/api/tutorials/:id
  @DeleteMapping("/tutorials/{id}")
  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") String id) {
   return tutorialService.deleteTutorial(id);
  }

  //DELETE    http://localhost:8090/api/tutorials
  @DeleteMapping("/tutorials")
  public ResponseEntity<HttpStatus> deleteAllTutorials() {
   return tutorialService.deleteAllTutorials();
  }


}
