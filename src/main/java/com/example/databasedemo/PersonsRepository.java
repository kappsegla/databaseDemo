package com.example.databasedemo;

import com.example.databasedemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepository extends JpaRepository<Person, Long> {
    Person findPersonByName(String name);
}
