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
    public void luoPelilauta(int s) {

        int[][] pelilauta = new int[4][s];
        int k = 0;

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 4; j++) {
                pelilauta[k][i] = 0;
                j++;
            }
            
            //KESKEN
            
            
        }
    }
}
