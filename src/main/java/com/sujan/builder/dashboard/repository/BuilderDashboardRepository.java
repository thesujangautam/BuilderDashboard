package com.sujan.builder.dashboard.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sujan.builder.dashboard.model.BuilderDetails;

@Repository
public interface BuilderDashboardRepository extends MongoRepository<BuilderDetails, String> {
	List<BuilderDetails> findByName(String builderName);
	
}
