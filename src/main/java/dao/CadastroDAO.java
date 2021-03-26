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


/**
 *
 * @author ramir
 */
public class CadastroDAO {
    public static boolean cadastrarUsuario (Usuario usuario) throws Exception{
        //1. Especificar o comando SQL
        String sql = "INSERT INTO tb_usuario (nome, senha) VALUES (?, ?)";
        //2. Abrir uma conexão
        //try with resources
        //3. Preparar o comando
        try(Connection conexao = ConexaoDB.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);){         
            //4. Substituir os placeholders (?)
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            
            //executa o comando
            ps.execute();
//            try(ResultSet rs = ps.executeQuery()){
//                return rs.next();
//            }
            return true;
      
            }
        //return false;
    }
}
