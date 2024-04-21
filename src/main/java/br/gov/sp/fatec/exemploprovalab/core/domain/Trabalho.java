package br.gov.sp.fatec.exemploprovalab.core.domain;

import br.gov.sp.fatec.exemploprovalab.core.command.SalvarPessoaCommand;
import br.gov.sp.fatec.exemploprovalab.core.repository.TrabalhoRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(name = "tra_trabalho")
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tra_id")
    private Long id;
    @Column(name = "tra_titulo")
    private String titulo;
    @Column(name = "tra_data_hora_entrega")
    private LocalDateTime dataHoraEntrega;
    @Column(name = "tra_descricao")
    private String descricao;
    @Column(name = "tra_grupo")
    private String grupo;
    @Column(name = "tra_nota")
    private Integer nota;
    @Column(name = "tra_justificativa")
    private String justificativa;

    public static Trabalho toEntity(SalvarPessoaCommand command){
        Trabalho trabalho = new Trabalho();
        trabalho.setTitulo(command.getTitulo());
        trabalho.setDataHoraEntrega(command.getDataEntrega());
        trabalho.setDescricao(command.getDescricao());
        trabalho.setGrupo(command.getGrupo());
        trabalho.setNota(command.getNota());
        trabalho.setJustificativa(command.getJustificativa());
        return trabalho;
    }
}
