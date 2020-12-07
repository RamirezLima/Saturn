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
    
    
    public String getNome (){
        return this.nome;
    }
    
    public String getSenha(){
        return this.senha;
    }

    public int getCodigo() {
        return codigo;
    }
        
}
