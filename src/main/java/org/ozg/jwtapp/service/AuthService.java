package org.ozg.jwtapp.service;

import org.ozg.jwtapp.models.request.LoginRequest;
import org.ozg.jwtapp.models.request.RegisterRequest;
import org.ozg.jwtapp.models.response.AuthResponse;

public interface AuthService {

    AuthResponse login(LoginRequest request);

    AuthResponse register(RegisterRequest request);

}
