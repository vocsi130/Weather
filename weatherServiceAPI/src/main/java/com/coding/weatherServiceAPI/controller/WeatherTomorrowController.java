package com.coding.weatherServiceAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.coding.weatherServiceAPI.dto.Response;
import com.coding.weatherServiceAPI.dto.Weather;
import com.coding.weatherServiceAPI.service.WeatherTomorrowService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/weatherTomorrow")
@RestController
@CrossOrigin(origins = "http://localhost:8086", maxAge = 6000)
@Api(value="api", description = "Data service operations for Weather", tags=("weather"))
public class WeatherTomorrowController {
  @Autowired
  WeatherTomorrowService weatherService;
	
@ApiOperation(value="Get Weather", notes="Gets Weather in the system", nickname="getWeather")
@GetMapping(value="/{zipCode}", produces="application/json")
@ResponseStatus(HttpStatus.OK)
 public ResponseEntity<?> getWeather(@PathVariable Integer zipCode) {
      try {
          return ResponseEntity.status(201).body(weatherService.getWeather(zipCode));
      } catch (Exception e) {
          return ResponseEntity.status(400).body(new Response(400, "input errors"));
      }
  }
}
