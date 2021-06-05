package com.devsuperior.desafiocapituloum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.desafiocapituloum.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
