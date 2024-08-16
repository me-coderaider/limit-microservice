package rtg.learning.microservices.limits_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rtg.learning.microservices.limits_service.bean.Limits;

@RestController
public class LimitsController {
	
	@GetMapping(path="/limits")
	public Limits retrieveLimits() {
		return new Limits(1,1000);
	}
}
