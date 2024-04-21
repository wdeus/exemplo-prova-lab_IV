package br.gov.sp.fatec.exemploprovalab.inbound.rest;

import br.gov.sp.fatec.exemploprovalab.core.command.SalvarPessoaCommand;
import br.gov.sp.fatec.exemploprovalab.core.domain.Trabalho;
import br.gov.sp.fatec.exemploprovalab.core.service.TrabalhoService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trabalho")
@RequiredArgsConstructor
public class TrabalhoController {

    private final TrabalhoService trabalhoService;

    @PostMapping
    public ResponseEntity salvar(@RequestBody SalvarPessoaCommand command){
        trabalhoService.salvar(command);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Trabalho>> carregarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(trabalhoService.buscarPorId(id));
    }

    @GetMapping()
    public ResponseEntity<List<Trabalho>> carregarTodos(){
        return ResponseEntity.ok(trabalhoService.buscarTodos());
    }
}
