/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author markolai
 */
public class Pelilauta {

    private int vaikeuaste;
    private ArrayList<Kuva> kuvat;
    private Kuva[][] pelilauta;

    public Pelilauta(int vaikeusaste) {

        if (vaikeusaste < 2) {
            luoPelilauta(3);
        } else if (vaikeusaste == 2) {
            luoPelilauta(5);
        } else {
            luoPelilauta(7);
        }
    }

    /**
     *
     * Luodaan pelilauta, parametrina vaikeusaste int v.
     */
    public void luoPelilauta(int v) {

        pelilauta = new Kuva[4][v];
        int k = 0;

        kuvat = new ArrayList<Kuva>(4 * v);
        luoKuvat(v);

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < 4; j++) {
                pelilauta[i][j] = kuvat.get(k);
                k++;
            }

        }


        //tulostaPelilauta(pelilauta, v);


    }

    /**
     *
     * Luodaan muistipelin kuvat, laitetaan ne listaan ja sekoitetaan.
     */
    private void luoKuvat(int v) {

        for (int i = 0; i < v / 2; i++) {

            Kuva kuva = new Kuva(i);
            kuvat.add(kuva);
            kuvat.add(kuva);

        }

        Collections.shuffle(kuvat);

    }
//    public void tulostaPelilauta(int[][] pelilauta, int v) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < v; j++) {
//                System.out.printf(" ", pelilauta[i][j]);
//            }
//            System.out.println();
//        }
//    }
}