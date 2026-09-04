package br.com.nhac.nhac_lojas.model.loja;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "tb_horario_funcionamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class HorariosFuncionamento {
    private DayOfWeek diaSemana;
    private LocalTime abertura;
    private LocalTime fechamento;
}
