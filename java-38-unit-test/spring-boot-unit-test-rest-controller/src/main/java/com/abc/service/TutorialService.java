package com.abc.service;

import com.abc.model.Tutorial;
import com.abc.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TutorialService {

  @Autowired
  TutorialRepository tutorialRepository;

  public ResponseEntity<List<Tutorial>> getAllTutorials(String title) {
    try {
        List<Tutorial> tutorials = new ArrayList<>();

        if (title == null) {
          tutorialRepository.findAll().forEach(tutorials::add);
        } else {
          tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);
        }

        if (tutorials.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(tutorials, HttpStatus.OK);

    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }


  public ResponseEntity<Tutorial> getTutorialById(long id) {
    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

    if (tutorialData.isPresent()) {
      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

  }


  public ResponseEntity<List<Tutorial>> findByPublished(boolean flag) {
    try {
      List<Tutorial> tutorials = tutorialRepository.findByPublished(flag);

      if (tutorials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tutorials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }




  public ResponseEntity<Tutorial> createTutorial(Tutorial tutorial) {
    try {
      Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }



  public ResponseEntity<Tutorial> updateTutorial(long id, Tutorial tutorial) {

    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

    if (tutorialData.isPresent()) {
        Tutorial tutorialInfo = tutorialData.get();
        tutorialInfo.setTitle(tutorial.getTitle());
        tutorialInfo.setDescription(tutorial.getDescription());
        tutorialInfo.setPublished(tutorial.isPublished());
        return new ResponseEntity<>(tutorialRepository.save(tutorialInfo), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }



  public ResponseEntity<HttpStatus> deleteTutorial(long id) {
    try {
        Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

        if (tutorialData.isPresent()) {
          tutorialRepository.deleteById(id);
          return new ResponseEntity<>(HttpStatus.OK);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  public ResponseEntity<HttpStatus> deleteAllTutorials() {
    try {
      // TODO SIZE KONTROLU YAPILACAK
      tutorialRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  }

}
