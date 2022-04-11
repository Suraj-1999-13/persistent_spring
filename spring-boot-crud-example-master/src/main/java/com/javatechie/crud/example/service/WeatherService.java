package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.entity.WeatherReport;
import com.javatechie.crud.example.repository.WetherRepository;

@Service
public class WeatherService {
	 @Autowired
	    private WetherRepository repository;

	    public WeatherReport saveReport(WeatherReport report) {
	        return repository.save(report);
	    }

	    public List<WeatherReport> saveReports(List<WeatherReport> report) {
	        return repository.saveAll(report);
	    }

	    public List<WeatherReport> getReports() {
	        return repository.findAll();
	    }

	    public WeatherReport getReportById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    //public Product getProductByName(String name) {
	      //  return repository.findByName(name);
	    //}

	    public Boolean deleteReport(int id) {
	        repository.deleteById(id);
	        return true;
	    }

	    public WeatherReport updateReport(WeatherReport report) {
	    	WeatherReport existingReport = repository.findById(report.getId()).orElse(null);
	    	existingReport.setCity(report.getCity());
	    	existingReport.setMaxTemperature(report.getMaxTemperature());
	    	existingReport.setMinTemperature(report.getMinTemperature());
	        return repository.save(existingReport);
	    }

}
