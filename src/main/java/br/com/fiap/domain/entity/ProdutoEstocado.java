package br.com.fiap.domain.entity;

import java.time.LocalDateTime;

public class ProdutoEstocado {


    Long id;


    Produto produto;


    Deposito deposito;


    String numeroDeSerie;


    LocalDateTime entrada;


    LocalDateTime saida;


}
