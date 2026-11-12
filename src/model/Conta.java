package model;

import java.math.BigDecimal;

public class Conta {

    private Long id;
    private String contaBancaria;
    private String agencia;
    private String numeroDaConta;
    private String nome;
    private BigDecimal saldo = BigDecimal.ZERO;

    /*
     * Para identificar uma conta bancária,
     * precisamos validar agência e número da conta.
     */

    public Conta (Long id, String nome, String agencia, String numeroDaConta){
        this.id = id;
        this.nome = nome;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;

    }

    // GET-SET ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // GET-SET CONTA BANCARIA
    public String getContaBancaria(){
        return contaBancaria;
    }
    public void setContaBancaria(String contaBancaria){
        this.contaBancaria = contaBancaria;
    }

    //GET-SET AGENCIA
    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    //GET-SET NUMERO DA CONTA
    public String getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    // GET-SET NOME
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // GET SALDO
    public BigDecimal getSaldo(){
        return saldo;
    }

    // metodo depositar
    public void depositar(BigDecimal valor){
        if (valor.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("Valor de depósito inválido ! ");
            return;

        }
        saldo = saldo.add(valor);

        System.out.println("Deposito realizado com sucesso ! ");
    }







}


