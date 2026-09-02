package br.com.nhac.nhac_lojas.controller;


import br.com.nhac.nhac_lojas.dto.loja.CadastroUsuarioLojaDto;
import br.com.nhac.nhac_lojas.dto.loja.CadastroUsuarioLojaResponseDto;
import br.com.nhac.nhac_lojas.model.loja.UsuarioLoja;
import br.com.nhac.nhac_lojas.service.UsuarioLojaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios-loja")
@RequiredArgsConstructor

public class UsuarioLojaController {
    private final UsuarioLojaService service;

    @PostMapping
    public ResponseEntity<UsuarioLoja> Cadastrar(@RequestBody @Valid CadastroUsuarioLojaDto dto){
        UsuarioLoja us = service.cadastrar(dto);

        var response = new CadastroUsuarioLojaResponseDto(
                us.getId(),
                us.getEmail(),
                us.getRoleUser()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(us);
    }
}
