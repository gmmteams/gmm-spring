package com.gmm.gmmapp.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GMM")

public class GMMController {

	@GetMapping
    public String sayHello() {
        return "Hello and Welcome to the GMM application";
    }
}
