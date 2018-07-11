package com.example.demo.controller;

import com.example.demo.dao.PersonDao;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/set")
    public void set(){
        Person person = new Person("1", "yjm", 18);
        personDao.save(person);
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }

}
