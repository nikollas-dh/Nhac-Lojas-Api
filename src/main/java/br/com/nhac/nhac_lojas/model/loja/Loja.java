package br.com.nhac.nhac_lojas.model.loja;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_Loja")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Loja {
    @Id
    private String id;

    private String nome;
    private String descricao;
    private String categoria;
    private String imagemUrl;

    @OneToOne(cascade = CascadeType.ALL)
    private DadosOperacionais dadosOperacionais;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    private GeoLocalizacao geoLocalizacao;

    @Embedded
    private List<HorariosFuncionamento> horariosFuncionamento;

}
