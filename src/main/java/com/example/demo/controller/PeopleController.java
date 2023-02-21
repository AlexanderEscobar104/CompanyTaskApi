package com.example.demo.controller;

import com.example.demo.model.People;
import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @GetMapping("")
    public List<People> list() {
        return peopleService.listAllPeople();
    }

    @GetMapping("/{id}")
    public ResponseEntity<People> get(@PathVariable Integer id) {
        try {
            People task = peopleService.getPeople(id);
            return new ResponseEntity<People>(task, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<People>(HttpStatus.NOT_FOUND);
        }
    }


}
