package com.maallam.Repository;
import com.maallam.Entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,Integer>
{

//Person findPersonById_personEquals(Integer id_person);
//Person findById_personEquals(int id_person);
}
