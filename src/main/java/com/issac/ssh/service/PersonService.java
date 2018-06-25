package com.issac.ssh.service;

import com.issac.ssh.dao.PersonDAO;
import com.issac.ssh.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Issac
 *  *   @date    2018-06-24
 * @desc
 */
@Service
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    public List<Person> getPersons() {
        return personDAO.getPersons();
    }

    public Person getPersonById(String id) {
        return personDAO.getPersonById(id);
    }


    public void addPerson(Person person) {
        this.personDAO.addPerson(person);
    }

    public void updatePerson(Person person) {
        this.personDAO.updatePerson(person);
    }

    public void deletePerson(String id) {
        this.personDAO.deletePerson(id);
    }
}
