package com.maallam.Controller;

import com.maallam.Entities.Person;
import com.maallam.Repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/persons")
public class PersonController {


        private PersonRepository personRepository;

        public PersonController(PersonRepository personRepository) {
            this.personRepository = personRepository;
        }

        @GetMapping("/all")
        public List<Person> getAll() {
            return personRepository.findAll();
        }
}
