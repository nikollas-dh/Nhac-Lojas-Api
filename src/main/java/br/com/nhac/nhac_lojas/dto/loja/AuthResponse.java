package br.com.nhac.nhac_lojas.dto.loja;

import br.com.nhac.nhac_lojas.model.loja.RoleUser;

public class AuthResponse {
    private String token;
    private String type = "Bearer";
    private String email;
    private String idLoja;
    private RoleUser role;


    public AuthResponse(String token, String email, String idLoja, RoleUser role) {
        this.token = token;
        this.email = email;
        this.idLoja = idLoja;
        this.role = role;
    }




}
