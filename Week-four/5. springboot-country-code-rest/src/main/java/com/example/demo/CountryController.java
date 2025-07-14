package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India", "New Delhi"));
        countryMap.put("US", new Country("US", "USA", "Washington D.C."));
        countryMap.put("JP", new Country("JP", "Japan", "Tokyo"));
    }

    @GetMapping("/country/{code}")
    public ResponseEntity<?> getCountryByCode(@PathVariable String code) {
        Country country = countryMap.get(code.toUpperCase());
        if (country == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(Map.of("error", "Country not found"));
        }
        return ResponseEntity.ok(country);
    }
}
