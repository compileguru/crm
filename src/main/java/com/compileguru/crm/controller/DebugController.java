package com.compileguru.crm.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
// Controller to debug JWT tokens should be removed in production environments
@RestController
public class DebugController {

@GetMapping("/debug/token")
public Map<String, Object> getTokenDetails(@AuthenticationPrincipal Jwt jwt) {
    return jwt.getClaims();
}
}