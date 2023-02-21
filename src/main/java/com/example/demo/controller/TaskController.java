package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;


    @GetMapping("")
    public List<Task> list() {
        return taskService.listAllTask();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> get(@PathVariable Integer id) {
        try {
            Task task = taskService.getTask(id);
            return new ResponseEntity<Task>(task, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Task task) {
        taskService.saveTask(task);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Task task, @PathVariable Integer id) {
        try {
            Task existTask = taskService.getTask(id);
            task.setId(id);
            taskService.saveTask(task);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        taskService.deleteTask(id);
    }
}
