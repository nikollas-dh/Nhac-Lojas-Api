package br.com.nhac.nhac_lojas.model.loja;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_geo_localizacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class GeoLocalizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private Double latitude;
    private Double longitude;
}
