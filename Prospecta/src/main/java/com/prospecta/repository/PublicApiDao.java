package com.prospecta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prospecta.model.PublicApi;

public interface PublicApiDao extends JpaRepository<PublicApi, Integer>{

	List<PublicApi> findAllByCategory(String categery);
	
}
