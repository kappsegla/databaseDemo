package com.example.databasedemo.mappers;

import com.example.databasedemo.dtos.PersonDto;
import com.example.databasedemo.entities.Person;

public class PersonMapper {

    public static Person dtoToEntity(PersonDto personDto){
        return new Person(personDto.id, personDto.name);
    }

    public static PersonDto entityToDto(Person person) {

        return new PersonDto(person.getId(), person.getName());
    }
}
