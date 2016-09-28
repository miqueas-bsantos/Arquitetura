package sp.senac.arquitetura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author miqueas.bsantos1
 */
@ManagedBean
@RequestScoped
public class LoginBean {

    
    private String nome;
    private String senha;
    
    @EJB
    private LoginEJBLocal loginEJB;
    
    public String realizarLogin(){
        boolean ok = loginEJB.validarUsuario(this.senha, this.nome);
        if (ok) {
          return "home";
        }
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Login", "Usuario/ senha Inválido");
        FacesContext.getCurrentInstance().addMessage(null, fm);
        return "#";
    }
    
    public LoginBean() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
