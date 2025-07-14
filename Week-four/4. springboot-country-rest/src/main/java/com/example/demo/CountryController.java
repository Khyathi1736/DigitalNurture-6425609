package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return Arrays.asList(
            new Country("India", "New Delhi"),
            new Country("USA", "Washington D.C."),
            new Country("Japan", "Tokyo")
        );
    }
}
