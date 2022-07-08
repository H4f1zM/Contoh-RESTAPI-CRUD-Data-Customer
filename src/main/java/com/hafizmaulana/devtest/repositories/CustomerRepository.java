package com.hafizmaulana.devtest.repositories;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hafizmaulana.devtest.entities.CustomerEntity;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Long >{

	Optional<CustomerEntity> findById(BigInteger id);


}


