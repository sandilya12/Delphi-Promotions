package com.promotions.delphi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promotions.delphi.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
