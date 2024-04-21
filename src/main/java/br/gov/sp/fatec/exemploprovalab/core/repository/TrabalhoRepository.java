package br.gov.sp.fatec.exemploprovalab.core.repository;

import br.gov.sp.fatec.exemploprovalab.core.domain.Trabalho;

import java.util.List;
import java.util.Optional;

public interface TrabalhoRepository {

    Trabalho salvar(Trabalho trabalho);

    List<Trabalho> carregarTodos();

    Optional<Trabalho> carregarPorId(Long id);
}
