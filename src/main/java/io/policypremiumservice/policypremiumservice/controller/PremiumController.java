package io.policypremiumservice.policypremiumservice.controller;

import io.policypremiumservice.policypremiumservice.model.PolicyPremium;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PremiumController {
	
	@GetMapping("/get-premium")
	public PolicyPremium calculateTotalPremium(){
		return new PolicyPremium(1000, 200, 800);
	}

}
