/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.util.Random;

/**
 *
 * @author markolai
 */
public class Pelilauta {

    private int vaikeuaste;

    public Pelilauta(int vaikeusaste) {

        if (vaikeusaste < 2) {
            luoPelilauta(3);
        } else if (vaikeusaste == 2) {
            luoPelilauta(5);
        } else {
            luoPelilauta(7);
        }
    }
    //KESKEN

    /**
     *
     * Luodaan pelilauta, parametrina vaikeusaste int v.
     */
    public void luoPelilauta(int v) {

        int[][] pelilauta = new int[4][v];
        int k = 0;

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < 4; j++) {
                pelilauta[k][i] = 0;
                j++;
            }


        }
        
        luoKortit(pelilauta, v);
        
        tulostaPelilauta(pelilauta, v);
        
        
    }
    
   //KESKEN

    public void tulostaPelilauta(int[][] pelilauta, int v) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < v; j++) {
                System.out.printf(" ", pelilauta[i][j]);
            }
            System.out.println();
        }
    }

    private void luoKortit(int[][] pelilauta, int v) {
        
        for (int i = 0; i < v/2; i++) {
            
            Kortti kortti = new Kortti(i);
            
            // sijoitetaan kortit taulukkoon ja sekoitetaan.
            
        }
       
    }
}