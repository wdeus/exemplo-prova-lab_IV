package br.gov.sp.fatec.exemploprovalab.outbound.jpa;

import br.gov.sp.fatec.exemploprovalab.core.domain.Trabalho;
import br.gov.sp.fatec.exemploprovalab.core.repository.TrabalhoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrabalhoJpaRepository extends JpaRepository<Trabalho, Long>, TrabalhoRepository {
    @Override
    default Trabalho salvar(Trabalho trabalho) {
        return save(trabalho);
    }

    @Override
    default List<Trabalho> carregarTodos() {
        return findAll();
    }

    @Override
    default Optional<Trabalho> carregarPorId(Long id) {
        return findById(id);
    }
}
