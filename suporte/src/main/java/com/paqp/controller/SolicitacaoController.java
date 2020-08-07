package com.paqp.controller;

import com.paqp.enums.EnumStatusSolicitacao;
import com.paqp.models.Solicitacao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/**
 *
 * @author PC
 */
@ManagedBean
@ApplicationScoped
public class SolicitacaoController {
    private Solicitacao solicitacao = new Solicitacao();
    private List<Solicitacao> solicitacoes = new ArrayList<>();
    
    public String solicitar(){
        Date data = Calendar.getInstance().getTime();
        solicitacao.setData(data);
        solicitacao.setStatus(EnumStatusSolicitacao.AGUARDANDO);
        solicitacao.setNumero(solicitacoes.size()+1);
        solicitacoes.add(solicitacao);
        
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Sucesso",  "Solicitação criada com sucesso"));

        solicitacao = new Solicitacao();
        return "/status?faces-redirect=true";
    }
    
    public void pegar(Solicitacao solicitacao){
       solicitacao.setStatus(EnumStatusSolicitacao.PROCESSANDO);
    }
    
    public void concluir(Solicitacao solicitacao){
       solicitacao.setStatus(EnumStatusSolicitacao.FINALIZADO);
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
}
