package com.maallam;

import com.maallam.Entities.Person;
import com.maallam.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MaallamApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository personRepository;
	public static void main(String[] args) {

		SpringApplication.run(MaallamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person(3, "Peter", "Development", "@mail",3000));
		personRepository.save(new Person(4, "Sam", "Operations","@mail", 2000));



	}
}
