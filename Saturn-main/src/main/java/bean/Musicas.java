/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author ramir
 */
public class Musicas {
    private int idmusica;
    private String nome;
    private String artista;

    public Musicas(int idMusica, String musica, String artista) {
        this.idmusica=idMusica;
        this.nome=musica;
        this.artista=artista;
        
    }

    public int getIdmusica() {
        return idmusica;
    }

    public void setIdmusica(int idmusica) {
        this.idmusica = idmusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    
    @Override
	public String toString() {
		return idmusica+nome+artista;
	}
    
    
}
