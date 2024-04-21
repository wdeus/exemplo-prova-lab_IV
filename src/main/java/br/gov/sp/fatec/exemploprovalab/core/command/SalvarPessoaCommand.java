package br.gov.sp.fatec.exemploprovalab.core.command;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SalvarPessoaCommand {

    private String titulo;
    private LocalDateTime dataEntrega;
    private String descricao;
    private String grupo;
    private Integer nota;
    private String justificativa;
}
