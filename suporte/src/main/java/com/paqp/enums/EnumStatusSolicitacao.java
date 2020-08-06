/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paqp.enums;

/**
 *
 * @author PC
 */
public enum EnumStatusSolicitacao {
    AGUARDANDO(1, "Aguardando..."), 
    PROCESSANDO(2, "Em atendimento..."),
    FINALIZADO(3, "Finalizado");
    
    public Integer key;
    public String valor;
    
    EnumStatusSolicitacao(Integer key, String valor){
        this.key = key;
        this.valor = valor;
    
    }
}
