/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramir
 */
public class ListaGenerosDAO {

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
    
   
    public static List <bean.Generos> buscarGenerosId(int id){

        String sql = "select idGeneros, genero from" 
                + " tb_usuario" 
                + " inner join" 
                + " tb_generos_has_tb_usuario" 
                + " on (tb_usuario.idusuario = tb_generos_has_tb_usuario.tb_usuario_idusuario)" 
                + " join" 
                + " saturn.tb_generos " 
                + " on (saturn.tb_generos.idGeneros = tb_generos_has_tb_usuario.tb_generos_idGeneros)" 
                + " where tb_usuario.idusuario = ?"; 
        
        List<bean.Generos> listaGeneros = new ArrayList<>();
        
        try {
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int idGeneros = rs.getInt("idGeneros");
                String genero = rs.getString("genero");

                bean.Generos generoBean = new bean.Generos(idGeneros, genero);
                listaGeneros.add(generoBean);

            }
            conexao.close();
            return listaGeneros;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return listaGeneros;
    }

    public static void deletar (int idGenero, int idUsuario){
        String sql = "DELETE FROM tb_generos_has_tb_usuario WHERE tb_generos_idGeneros = ? AND tb_usuario_idusuario= ? ;";
        try {
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, idGenero);
            ps.setInt(2, idUsuario);
            
            ps.execute();
            
            conexao.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void salvar (int idGenero, int idUsuario){
        String sql = "INSERT INTO tb_generos_has_tb_usuario (tb_generos_idGeneros, tb_usuario_idusuario) VALUES (?,?)";
        try {
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, idGenero);
            ps.setInt(2, idUsuario);
            
            ps.execute();
            
            conexao.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  

