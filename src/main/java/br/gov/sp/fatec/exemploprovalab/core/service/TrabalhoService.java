package br.gov.sp.fatec.exemploprovalab.core.service;

import br.gov.sp.fatec.exemploprovalab.core.command.SalvarPessoaCommand;
import br.gov.sp.fatec.exemploprovalab.core.domain.Trabalho;
import br.gov.sp.fatec.exemploprovalab.core.repository.TrabalhoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabalhoService {

    private final TrabalhoRepository trabalhoRepository;

    public TrabalhoService(TrabalhoRepository trabalhoRepository) {
        this.trabalhoRepository = trabalhoRepository;
    }

    public List<Trabalho> buscarTodos(){
        return trabalhoRepository.carregarTodos();
    }

    public Optional<Trabalho> buscarPorId(Long id){
        return trabalhoRepository.carregarPorId(id);
    }

    public Trabalho salvar(SalvarPessoaCommand command){
        return trabalhoRepository.salvar(Trabalho.toEntity(command));
    }
}
