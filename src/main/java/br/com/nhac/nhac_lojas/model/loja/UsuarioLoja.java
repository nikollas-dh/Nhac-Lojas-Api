package br.com.nhac.nhac_lojas.model.loja;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_usuarioLoja")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UsuarioLoja {
    @Id
    private String id;
    private  String nome;
    private  String email;
    private  String telefone;
    private  String senha;
    private  String idLoja;
    private  RoleUser roleUser;


}
