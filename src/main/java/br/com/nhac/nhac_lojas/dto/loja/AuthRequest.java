package br.com.nhac.nhac_lojas.dto.loja;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class AuthRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String senha;
}
