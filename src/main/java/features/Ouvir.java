/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author ramir
 */
public class Ouvir {
        
    
    public static void ouvirYoutube(String nome, String artista){
        String Url=nome+" "+artista;
        String link = Url.replaceAll(" ", "+");
        //JOptionPane.showMessageDialog(null, link);
        Url= String.format("https://www.youtube.com/results?search_query=%s",link);
         
       Desktop d = Desktop.getDesktop();
      try {
         d.browse( new URI(Url) );
      }
      catch ( IOException e ) {
         System.out.println(e);
      }
      catch ( URISyntaxException e ) {
         System.out.println(e);
      }
    
    }
    public static void ouvirDeezer(String nome, String artista){
        String Url=nome+" "+artista;
        String link = Url.replace(" ", "%20");
        Url= String.format("https://www.deezer.com/search/%s/track",link);
         
       Desktop d = Desktop.getDesktop();
      try {
         d.browse( new URI(Url) );
      }
      catch ( IOException e ) {
         System.out.println(e);
      }
      catch ( URISyntaxException e ) {
         System.out.println(e);
      }
    
    }
    public static void ouvirVagalume(String nome, String artista){
        String Url=nome+" "+artista;
        String link = Url.replaceAll(" ", "+");
        //JOptionPane.showMessageDialog(null, link);
        Url= String.format("https://www.vagalume.com.br/search?q=%s",link);
         
       Desktop d = Desktop.getDesktop();
      try {
         d.browse( new URI(Url) );
      }
      catch ( IOException e ) {
         System.out.println(e);
      }
      catch ( URISyntaxException e ) {
         System.out.println(e);
      }
    
    }
    public static void ouvirSpotify(String nome, String artista){
        String Url=nome+" "+artista;
        String link = Url.replaceAll(" ", "%20");
        //JOptionPane.showMessageDialog(null, link);
        Url= String.format("https://open.spotify.com/search/%s/tracks",link);
         
       Desktop d = Desktop.getDesktop();
      try {
         d.browse( new URI(Url) );
      }
      catch ( IOException e ) {
         System.out.println(e);
      }
      catch ( URISyntaxException e ) {
         System.out.println(e);
      }
    
    }
    
    
    
}
