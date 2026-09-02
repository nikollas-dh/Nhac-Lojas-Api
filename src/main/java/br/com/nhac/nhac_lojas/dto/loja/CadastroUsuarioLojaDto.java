package br.com.nhac.nhac_lojas.dto.loja;

import br.com.nhac.nhac_lojas.model.loja.RoleUser;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;


@Getter
public class CadastroUsuarioLojaDto {

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private  String senha;

    private RoleUser roleUser = RoleUser.ADMIN;


}
