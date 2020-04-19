package com.rabi.spring.cloud.security.api.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableOAuth2Sso
@RestController
public class OAuthController {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()
		+" welcome to SpringCloudOauth2ExampleApplication";
	}
}
