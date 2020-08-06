package com.paqp.models;

import com.paqp.enums.EnumStatusSolicitacao;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Solicitacao {
    private Integer numero;
    private String descricao;
    private String nome;
    private String email;
    private Date data;
    private EnumStatusSolicitacao status;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public EnumStatusSolicitacao getStatus() {
        return status;
    }

    public void setStatus(EnumStatusSolicitacao status) {
        this.status = status;
    }

    public void add(Solicitacao solicitar) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public Integer somar(Integer a, Integer b){
        return a + b;
    }

}

