package com.example.Hatake.service;

import com.example.Hatake.dao.PersonDao;
import com.example.Hatake.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("postgress") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insterPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPerson();

    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }
}
