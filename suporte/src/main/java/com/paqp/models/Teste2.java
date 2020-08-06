/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paqp.models;

/**
 *
 * @author pc
 */
public class Teste2 extends Solicitacao{
    public Double multiplicar(Double z, Double m){
        return z*m;
    }
    
    @Override
    public Integer somar(Integer k, Integer l){
        return k+l;
    }
}
