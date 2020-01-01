package com.coding.weatherServiceAPI.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Weather implements Serializable{
 private LocalDate date;
 private Integer maxtempC;
 private Integer maxtempF;
 private Integer mintempC;
 private Integer mintempF;
 private Integer avgtempC;
 private Integer avgtempF;
 private Double totalSnow_cm;
 private Double sunHour;
 private Integer uvIndex;
 private Astronomy astronomy;
 private Hourly hourly;
 private City city;
}
