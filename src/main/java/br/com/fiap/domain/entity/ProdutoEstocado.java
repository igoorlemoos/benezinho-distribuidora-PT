package br.com.fiap.domain.entity;

import java.time.LocalDateTime;

public class ProdutoEstocado {
    Long id;
    Produto produto;
    Deposito deposito;
    String numeroDeSerie;
    LocalDateTime entrada;
    LocalDateTime saida;



    public ProdutoEstocado() {
    }

    public ProdutoEstocado(Long id, Produto produto, Deposito deposito, String numeroDeSerie, LocalDateTime entrada,
                           LocalDateTime saida) {
        this.id = id;
        this.produto = produto;
        this.deposito = deposito;
        this.numeroDeSerie = numeroDeSerie;
        this.entrada = entrada;
        this.saida = saida;
    }


}
