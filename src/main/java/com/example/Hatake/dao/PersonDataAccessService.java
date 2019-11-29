package com.example.Hatake.dao;

import com.example.Hatake.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("postgress")
public class PersonDataAccessService implements PersonDao {
    @Override
    public int insterPerson(UUID id, Person person) {
        return 0;
    }

//    @Override
//    public List<Person> selectAllPerson() {
//        return null;
//    }

    @Override
    public List<Person> selectAllPerson() {
        return List.of(new Person(UUID.randomUUID(),"test","sdfssdfsd"));
    }


    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatPersonById(UUID id, Person person) {
        return 0;
    }
}
