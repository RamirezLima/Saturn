/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Generos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramir
 */
public class ListaGeneros {

    //private static Object bean;
    public static List <bean.Generos> obterGeneros () throws Exception{
        String sql = "SELECT * FROM tb_generos";
        List <bean.Generos> generos = new ArrayList<>();
        try(Connection conexao = connection.ConexaoDB.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery()){
            System.out.print("Passei na conexao");
            while (rs.next()){
                int id = rs.getInt("idGeneros");
                String nome = rs.getString("genero");
                //String tipo = rs.getString("tipo");
                bean.Generos genero = new bean.Generos(id, nome);
                generos.add(genero);
                //cursos.add(new Curso (id, nome, tipo));
                System.out.print("Passei nos campos");
            }
            return generos;
        }
    }
        
  
}
