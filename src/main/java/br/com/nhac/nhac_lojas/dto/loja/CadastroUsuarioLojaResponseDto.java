package br.com.nhac.nhac_lojas.dto.loja;

import br.com.nhac.nhac_lojas.model.loja.RoleUser;

public record CadastroUsuarioLojaResponseDto(String id, String email, RoleUser roleUser) {
}
