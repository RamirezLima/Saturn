/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import connection.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ramir
 */
public class ValidarDAO {
     public static boolean valida (Usuario usuario) throws Exception{
        //1. Especificar o comando SQL
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        //2. Abrir uma conexão
        //try with resources
        //3. Preparar o comando
        try(Connection conexao = ConexaoDB.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);){         
            //4. Substituir os placeholders (?)
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
                
            }
        }
    }
     
     
     
     public static int dados(String nome){
         String sql = "SELECT * FROM tb_usuario WHERE nome = ?";
         
         
            try (Connection c = ConexaoDB.obterConexao()){
                //3: Pré compila o comando
                PreparedStatement ps = c.prepareStatement(sql);
                //4: Executa o comando e guarda
                
                ps.setString(1, nome);
                //o resultado em um ResultSet
                ResultSet rs = ps.executeQuery();
                //5: iteUsuario ra sobre o resultado
                bean.Usuario usuarioBean= new bean.Usuario();
                while (rs.next()){
                int codigo = rs.getInt("idusuario");
                usuarioBean.setCodigo(codigo);
                //String nome = rs.getString("nome");
                //int aux = codigo;
//                String aux = String.format(
//                "%d",codigo);
                
                //JOptionPane.showMessageDialog (null, aux);
                
                }
                return usuarioBean.getCodigo();
                } catch (Exception e){
                    e.printStackTrace();
                }
         return 0;
       
         
     }

    

    
}


