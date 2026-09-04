package br.com.nhac.nhac_lojas.model.loja;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Endereco {
    @Id
    String id;
    String cep;
    String Rua;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
}
