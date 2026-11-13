package model;


import java.time.LocalDate;
import java.math.BigDecimal;

public class Transacao {
    private LocalDate dataTransacao;
    private BigDecimal valorTransacao;
    private String tipo;
    private Conta conta;
    private Categoria categoria;



    //Construtor
    public Transacao (String tipo, Conta conta, Categoria categoria, LocalDate dataTransacao, BigDecimal valorTransacao){
        this.tipo = tipo;
        this.conta = conta;
        this.categoria = categoria;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
        validar();
        validarTipo();

    }

    //GET-SET
    public LocalDate getDataTransacao() {return dataTransacao;} //so get


    public BigDecimal getValorTransacao() {return valorTransacao;} //so get

    public String getTipo() {return tipo;}

    public Conta getConta() {return conta;}

    public Categoria getCategoria () {return categoria;}



    public void validar(){
        if (conta == null ){
            throw new IllegalArgumentException(" ERRO_CONTA ! Tente novamente ! ");
        }
        if (categoria == null){
            throw new IllegalArgumentException(" ERRO_CATEGORIA ! Tente novamente ! ");
        }
        if (dataTransacao == null){
            throw new IllegalArgumentException(" ERRO_DATA DE TRANSAÇÂO ! Tente novamente ! ");
        }
        if (valorTransacao == null){
            throw new IllegalArgumentException("ERRO VALOR_TRANSAÇÃO ! Tente novamente ! ");
        } if (valorTransacao.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("ERRO VALOR_TRANSAÇÃO ABAIXO ! Tente novamente ! ");

        }

    }

    // metodo para validar o atributo tipo


    public void validarTipo() {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("O tipo não pode ficar nulo (null) ");
        }
    }
}

