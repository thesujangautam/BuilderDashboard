package com.sujan.builder.dashboard.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sujan.builder.dashboard.model.BuilderDetails;
import com.sujan.builder.dashboard.repository.BuilderDashboardRepository;


@RestController
@RequestMapping({"/api"})
public class BuilderDashboardController {
	
		@Autowired
		BuilderDashboardRepository builderDashboardRepository;
		
		@GetMapping("/builder")
		public ResponseEntity<List<BuilderDetails>> getAllDetails(@RequestParam(required= false) String builderName){
			try {
				List<BuilderDetails> builderDetails = new ArrayList<BuilderDetails>();
				
				if (builderName==null) 
					builderDashboardRepository.findAll().forEach(builderDetails::add);
				else 
						builderDashboardRepository.findByName(builderName).forEach(builderDetails::add);
				if (builderDetails.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				
				return new ResponseEntity<>(builderDetails,HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
}
