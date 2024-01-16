package models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UUID;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "TB_CONTROLE_ESTACIONAMENTO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ControleEstacionamentoCondominioModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String numeroVagaEstacionamento;
    @Column(nullable = false, unique = true, length = 7)
    private String placaVeiculo;
    @Column(nullable = false, unique = true, length = 20)
    private String marcaVeiculo;
    @Column(nullable = false, unique = true, length = 20)
    private String modeloVeiculo;
    @Column(nullable = false, unique = true, length = 15)
    private String corVeiculo;
    @Column(nullable = false)
    private LocalDateTime dataRegistro;
    @Column(nullable = false, length = 100)
    private String nomeResposavelVeiculo;
    @Column(nullable = false, length = 10)
    private String apartamento;
    @Column(nullable = false, length = 10)
    private String bloco;


}
