package com.example.springboot.demo.firstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoRestController {

    //inject properties for captain and team name

    @Value("${captain.name}")
    private String CaptainName;

    @Value("${team.name}")
    private String TeamName;

    //expose new endpoint for teaminfo

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Captain: " +CaptainName+ " , Team Name: " +TeamName;
    }

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String Hello(){
        return "Hello World";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5 km";
    }

    //expose another endpoint for "fortune"
    @GetMapping("/fortune")
        public String getDailyFortune(){
            return "Today is your lucky Day";
        }
}
