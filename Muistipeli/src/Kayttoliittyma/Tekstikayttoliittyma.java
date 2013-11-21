/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import Logiikka.Pelilauta;
import java.util.Scanner;

/**
 *
 * @author markolai
 */
public class Tekstikayttoliittyma {

    private Scanner lukija;
    private int vaikeusaste;
    private Pelilauta pelilauta;

    public Tekstikayttoliittyma() {

        lukija = new Scanner(System.in);
        aloitus();
    }

    private void aloitus() {

        System.out.println("Muistipeli.");
        System.out.println("Aloita peli syöttämällä vaikeusaste 1-3.");

        vaikeusaste = lukija.nextInt();

        while (vaikeusaste < 1 || vaikeusaste > 3) {
            System.out.println("Vaikeusasteen tulee olla väliltä 1-3.");
            vaikeusaste = lukija.nextInt();
        }
        
        pelilauta = new Pelilauta(vaikeusaste);
        
        

    }
}