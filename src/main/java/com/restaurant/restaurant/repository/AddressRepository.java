package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}