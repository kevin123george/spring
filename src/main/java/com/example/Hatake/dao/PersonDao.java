package com.example.Hatake.dao;

import com.example.Hatake.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insterPerson(UUID id, Person person);

    default int insterPerson(Person person){
        UUID id = UUID.randomUUID();
        return insterPerson(id,person);
    }

}
