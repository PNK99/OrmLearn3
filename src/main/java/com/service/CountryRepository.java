package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	
	public List<Country> findByNameContaining(String name);
	
	public List<Country> findByNameContainingOrderByNameAsc(String name);
	@Query("SELECT e FROM Country e WHERE e.name LIKE ?1%")
	public List<Country> findByCharacter(Character name);
	
}
