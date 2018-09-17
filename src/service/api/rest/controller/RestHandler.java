package service.api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.api.rest.models.Hello;

@RestController
public class RestHandler {

	@GetMapping(value="/service/api/message/hello")
	public Hello simple() {
		Hello say = new Hello();
		say.setHello("Hello");
		return say;
	}
}
