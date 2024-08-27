package com.example.privatespring.api;

import com.example.privatespring.requests.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserApi {
    @PostMapping("/v1/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok("");
    }
}
