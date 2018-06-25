package com.issac.ssh.controller;

import com.issac.ssh.entity.Person;
import com.issac.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-24
 * @desc
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/getPsersons")
    @ResponseBody
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @RequestMapping(value = "/getPersonById")
    @ResponseBody
    public Person getPersonById(String id) {
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "/addPerson")
    public void addPerson(Person person) {
        personService.addPerson(person);
    }

    @RequestMapping(value = "/updatePerson")
    public void updatePerson(Person person) {
        personService.updatePerson(person);

    }

    @RequestMapping(value = "/deletePerson")
    public void deletePerson(String id) {
        personService.deletePerson(id);

    }
}
