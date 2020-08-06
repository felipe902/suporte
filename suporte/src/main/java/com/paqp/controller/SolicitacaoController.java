package com.paqp.controller;

import com.paqp.enums.EnumStatusSolicitacao;
import com.paqp.models.Solicitacao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author PC
 */
@ManagedBean
@ApplicationScoped
public class SolicitacaoController {
    private Solicitacao solicitacao = new Solicitacao();
    private List<Solicitacao> solicitacoes = new ArrayList<>();
    
    private Solicitacao solicitar = new Solicitacao();
    private List<Solicitacao> solicitars = new ArrayList<>();
    
    public String solicitar(){
        Date data = Calendar.getInstance().getTime();
        solicitacao.setData(data);
        solicitar.setData(data);
        solicitacao.setStatus(EnumStatusSolicitacao.AGUARDANDO);
        solicitar.setStatus(EnumStatusSolicitacao.PROCESSANDO); 
        solicitacao.setNumero(solicitacoes.size()+1);
        solicitar.setNumero(solicitars.size()+3);
        solicitacoes.add(solicitacao);
        solicitars.add(solicitar);
        solicitacao = new Solicitacao();
        solicitar = new Solicitacao();
        return "/status?faces-redirect=true";
    }
    
    public void pegar(Solicitacao solicitacao){
       solicitacao.setStatus(EnumStatusSolicitacao.PROCESSANDO);
    }
    
    public void concluir(Solicitacao solicitav){
       solicitav.setStatus(EnumStatusSolicitacao.FINALIZADO);
    }
    
    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    public Solicitacao getSolicitar() {
        return solicitar;
    }

    public void setSolicitar(Solicitacao solicitar) {
        this.solicitar = solicitar;
    }

    public List<Solicitacao> getSolicitars() {
        return solicitars;
    }

    public void setSolicitars(List<Solicitacao> solicitars) {
        this.solicitars = solicitars;
    }
    

}
