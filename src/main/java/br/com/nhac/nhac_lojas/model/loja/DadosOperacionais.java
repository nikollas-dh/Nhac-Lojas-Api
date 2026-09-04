package br.com.nhac.nhac_lojas.model.loja;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_dados_operacionais")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DadosOperacionais {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String telefone;

    private String whatsapp;

    private String email;

    private boolean aceitaDelivery;

    private boolean aceitaRetirada;

    private boolean aceitaCartao;

    private boolean aceitaPix;
}
