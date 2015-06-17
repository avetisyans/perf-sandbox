package com.comp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comp.app.entity.Address;

@Repository("addressDao")
public interface AddressDao extends JpaRepository<Address, Long>{

}
