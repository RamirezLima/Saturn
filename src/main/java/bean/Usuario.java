/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author rodrigo
 */
public class Usuario {
    
    private int codigo;
    private String nome;
    private String senha;
    
    public Usuario (String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
     public Usuario (int codigo, String nome, String senha){
        this.nome = nome;
        this.senha = senha;
        this.codigo=codigo;
    }

    public Usuario() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    public String getNome (){
        return this.nome;
    }
    
    public String getSenha(){
        return this.senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        
}
