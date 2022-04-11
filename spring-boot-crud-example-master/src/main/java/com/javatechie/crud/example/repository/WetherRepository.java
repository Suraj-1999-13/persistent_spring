package com.javatechie.crud.example.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.javatechie.crud.example.entity.WeatherReport;

public interface WetherRepository extends JpaRepository<WeatherReport,Integer>{

}
