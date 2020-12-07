/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramir
 */
public class MusicasDAO {
    private int qteusuario;
    private int notatotal;
    private double media;
    
    public static List <bean.Musicas> listaMusicaRecomendada(int id){
        
        String sql= "select musica.* from  "
                + " saturn.tb_usuario usuario"
                + " inner join"
                + " saturn.tb_generos_has_tb_usuario genero "
                + " on (usuario.idusuario = genero.tb_usuario_idusuario) "
                + " inner join"
                + " saturn.tb_generos_has_tb_musicas genero_musica "
                + " on (genero.tb_generos_idGeneros = genero_musica.tb_generos_idGeneros) "
                + " inner join"
                + " saturn.tb_musicas musica "
                + " on (genero_musica.tb_musicas_idmusicas = musica.idmusicas) "
                + " where usuario.idusuario = ? "
                + " order by musica.media desc";
        /*
         String sql= "select * from "
                + " saturn.tb_musicas musica "
                + " left join "
                + " saturn.tb_musicaavaliada_has_tb_usuario usuario "
                + " on (musica.idmusicas = usuario.tb_musicaavaliada_idmusicaavaliada) "
                + " where usuario.tb_usuario_idusuario <> ? "
                + " or usuario.tb_musicaavaliada_idmusicaavaliada is null "
                + " order by musica.media desc "
                */
        
            List<bean.Musicas> listaMusicas = new ArrayList<>();
            
            
            
            try {
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int idMusica = rs.getInt("idmusicas");
                String musica = rs.getString("nome");
                String artista = rs.getString("artista");

                bean.Musicas musicaBean = new bean.Musicas(idMusica, musica, artista);
                listaMusicas.add(musicaBean);

            }
            conexao.close();
            return listaMusicas;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return listaMusicas;
            
    
    
    }
    
    
    
    public static List <bean.Musicas> listaMusicaAvaliada(int id){
        
        String sql= "select m.nome, m.artista, m.idmusicas"
                + " from saturn.tb_usuario as a"
                + " inner join saturn.tb_musicaavaliada_has_tb_usuario as b"
                + " 	on (a.idusuario = b.tb_usuario_idusuario) "
                + " inner join saturn.tb_musicaavaliada as c "
                + " 	on (c.idmusicaavaliada = b.tb_musicaavaliada_idmusicaavaliada) "
                + " inner join saturn.tb_musicas as m "
                + " 	on (m.idmusicas = c.tb_musicas_idmusicas)"
                + " where"
                + " 	a.idusuario = ?";
        
            List<bean.Musicas> listaMusicas = new ArrayList<>();
            
            
            
            try {
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int idMusica = rs.getInt("idmusicas");
                String musica = rs.getString("nome");
                String artista = rs.getString("artista");

                bean.Musicas musicaBean = new bean.Musicas(idMusica, musica, artista);
                listaMusicas.add(musicaBean);

            }
            conexao.close();
            return listaMusicas;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return listaMusicas;
            
    
    
    }
    
    public void resgataNota(bean.Musicas musica, int idusuario, int nota){
        String sql = "select notatotal, qteusuarios, media  from tb_musicas where idmusicas=?";
        try {
            //resgata informações de nota para calculo da média
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, musica.getIdmusica());
            System.out.println(musica.getIdmusica());
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int notaTotal= rs.getInt("notatotal");
                int qteUsuario= rs.getInt("qteusuarios");
                
                notaTotal = notaTotal+nota;
                qteUsuario++;
                double media=(notaTotal/qteUsuario);
                this.media=media;
                this.notatotal=notaTotal;
                this.qteusuario= qteUsuario;
                //inseri no banco
                //inserirAvaliacaoTabela(int nota, int qte, double media);
               
                System.out.println("nota total: "+notaTotal);
                System.out.println("quatidade: "+qteUsuario);
                System.out.println("media: "+media);

            }
            
           


            
            ps.execute();
            
            conexao.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        /*
        try {
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, musica.getIdmusica());
            ps.setInt(2, idusuario);
            ps.setInt(3, nota);
            
            ps.execute();
            
            conexao.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
    public void inserirAvaliacaoTabela(bean.Musicas musica) {
        String sql = "UPDATE saturn.tb_musicas SET notatotal = ?, qteusuarios = ?, media = ? WHERE (idmusicas = ?)";
       try {
            //resgata informações de nota para calculo da média
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, notatotal);
            ps.setInt(2, qteusuario);
            ps.setDouble(3, media);
            ps.setInt(4, musica.getIdmusica());
            ps.execute();
            
            conexao.close();
            
        } catch (Exception e) {
        }
    }
    
    public void inserirAvaliacaoTabelaUsuario(int idmusicaavaliada, int iduser) {
        String sql = "INSERT INTO saturn.tb_musicaavaliada_has_tb_usuario (tb_musicaavaliada_idmusicaavaliada, tb_usuario_idusuario) VALUES (?, ?)";
       try (Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);){
            //resgata informações de nota para calculo da média
            
            
            ps.setInt(1, idmusicaavaliada);
            ps.setInt(2, iduser);
            ps.execute();
        
    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }
    
    public int inserirAvaliacao(int nota, int idmusica) {
        String sql = "INSERT saturn.tb_musicaavaliada (nota, tb_musicas_idmusicas) VALUES (?, ?)";
        int aux=0;
       try {
            //resgata informações de nota para calculo da média
            Connection conexao = connection.ConexaoDB.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, nota);
            ps.setInt(2, idmusica);
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
          if (generatedKeys.next()) {
                aux=generatedKeys.getInt(1);
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }            conexao.close();
          return aux;
            
            

            
        } catch (Exception e) {
        }
       return aux;
    }
    
    
}
