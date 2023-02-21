package com.example.demo.service;

import com.example.demo.model.People;
import com.example.demo.model.Task;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class PeopleService {

        @Autowired
        private PeopleRepository peopleRepository;
        public List<People> listAllPeople() {
            return peopleRepository.findAll();
        }

        public People getPeople(Integer id) {
        return peopleRepository.findById(id).get();
    }
}
