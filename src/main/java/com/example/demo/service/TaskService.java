package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> listAllTask() {
        return taskRepository.findAll();
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    public Task getTask(Integer id) {
        return taskRepository.findById(id).get();
    }

    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }
}
