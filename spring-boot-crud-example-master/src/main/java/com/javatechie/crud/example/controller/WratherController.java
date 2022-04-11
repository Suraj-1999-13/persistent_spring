package com.javatechie.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.entity.WeatherReport;
import com.javatechie.crud.example.service.WeatherService;

@RestController
public class WratherController {
	@Autowired
    private WeatherService service;
    
	@GetMapping("/weatherReport")
	public List<WeatherReport> getData()
	{
		return service.getReports();
	}
	
	@PostMapping("/weatherReport")
	public WeatherReport addUsers(@RequestBody WeatherReport cases)
	{
		return service.saveReport(cases);
	}
	
	@PutMapping("/weatherReport")
	public WeatherReport updateUsers(@RequestBody WeatherReport cases)
	{
		return service.updateReport(cases);
	}
	
	@GetMapping("/weatherReport/{id}")
	public WeatherReport view(@PathVariable int id)
	{
		return service.getReportById(id);
	}
	
	@DeleteMapping("/weatherReport/{id}")
	public Boolean deleteUsers(@PathVariable int id)
	{
		return service.deleteReport(id);
	}
}
