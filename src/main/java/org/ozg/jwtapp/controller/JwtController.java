package org.ozg.jwtapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class JwtController {

    @PostMapping(value = "welcome")
    public String welcome() {
        return "Welcome from secure endpoint";
    }
}
