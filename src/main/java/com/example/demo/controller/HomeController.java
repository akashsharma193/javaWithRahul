package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DataModel;
import com.example.demo.service.DataService;

@RestController
@CrossOrigin
public class HomeController {

	@Autowired
	DataService dataService;
	
	@PostMapping("home")
	public DataModel home(@RequestBody DataModel data) {
		DataModel dataValue = dataService.validateData(data);
		if(dataValue!=null) {
			return data;
		}else {
			data.setName("No data found");
			return data;
		}
		
	}
}
