package com.issac.ssh.dao;


import com.issac.ssh.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-24
 * @desc
 */
@Repository
public class PersonDAO {

    @Resource
    private SessionFactory sessionFactory;

    @SuppressWarnings("unused")
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Person> getPersons(){
        return (List<Person>)this.getSession().createCriteria(Person.class);
    }

    public Person getPersonById(String id) {
        Person person = (Person) this.getSession().createQuery("from Person where id = ?").setParameter(0,id).uniqueResult();
        return person;
    }

    public void addPerson(Person person) {
        this.getSession().save(person);
    }

    public void updatePerson(Person person) {
        this.getSession().update(person);
    }

    public void deletePerson(String id) {
        this.getSession().createQuery("delete Person where id = ?").setParameter(0,id).executeUpdate();
    }
}
