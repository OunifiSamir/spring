package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Client;

public interface samir extends CrudRepository<Client, Long>{

}
