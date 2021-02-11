package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.model.DataModel;
import com.example.demo.service.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Override
	public DataModel validateData(DataModel data) {
		if(data.getName().equals("admin") && data.getPassword().equals("password")) {
			return data;
		}else {
			return null;
		}
	}

}
