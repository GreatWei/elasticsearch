package com.example.elasticsearch.repository;

import com.example.elasticsearch.entity.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PersonRepository extends ElasticsearchRepository<Person, Long> {
    List<Person> findByLastname(String lastname);
}