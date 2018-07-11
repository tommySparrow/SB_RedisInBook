package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class PersonDao {

    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valOps;

    public void save(Person person){
        valOps.set(person.getId(),person);
    }
    public Person getPerson(){
        return (Person) valOps.get("1");
    }

}
