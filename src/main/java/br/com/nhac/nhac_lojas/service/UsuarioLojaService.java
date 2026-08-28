package br.com.nhac.nhac_lojas.service;


import br.com.nhac.nhac_lojas.dto.loja.CadastroUsuarioLojaDto;
import br.com.nhac.nhac_lojas.infra.repository.UsuarioLojaRepository;
import br.com.nhac.nhac_lojas.model.loja.UsuarioLoja;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioLojaService {
    private final UsuarioLojaRepository repository;



//    public UsuarioLoja cadastrar(CadastroUsuarioLojaDto req){
//
//
//    }
}
