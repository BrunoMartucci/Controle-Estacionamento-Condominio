package dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ControleEstacionamentoCondominioDto {


    @NotBlank
    private String numeroVagaEstacionamento;
    @NotBlank
    @Size(max = 7)
    private String placaVeiculo;
    @NotBlank
    private String marcaVeiculo;
    @NotBlank
    private String modeloVeiculo;
    @NotBlank
    private String corVeiculo;
    @NotBlank
    private String nomeResponsavelVeiculo;
    @NotBlank
    private String apartamento;
    @NotBlank
    private String bloco;
}
