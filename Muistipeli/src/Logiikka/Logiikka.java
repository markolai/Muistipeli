/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

/**
 *
 * @author markolai
 */
public class Logiikka {

    /**
     * Alustetaan vaikeustaso helpoksi.
     */
    private static int vaikeus = 1;
    /**
     * Alustetaan käytetyt arvaukset nollaksi.
     */
    private static int arvaukset = 0;
    /**
     * Alustetaan onkoKorttiaKaannetty epätodeksi.
     */
    private static boolean onkoKorttiaValittuna = false;
    private static boolean ovatkoKortitPari;

    public Logiikka() {
        int vaikeusaste = 1;
        uusiPeli(vaikeusaste);
    }

    public static void uusiPeli(int vaikeusaste) {

        if (vaikeusaste < 0 || vaikeusaste > 3) {
            throw new IllegalArgumentException("Vaikeusaste tulee olla väliltä 1-3.");
        } else {
            Pelilauta pelilauta = new Pelilauta(vaikeusaste);
        }
    }

    /**
     * Palautetaan vaikeusaste kysyttäessä.
     */
    public static int getVaikeus() {
        return vaikeus;
    }

    /**
     * Palautetaan arvausten lukumäärä kysyttäessä.
     */
    public static int getArvaukset() {
        return arvaukset;
    }

    /**
     * Palautetaan totuusarvo "onko jokin kortti käännetty" kysyttäessä.
     */
    public static boolean onkoKorttiaValittuna() {
        return onkoKorttiaValittuna;
    }

    public static void valitseKortti() {
        onkoKorttiaValittuna = true;
    }

    public static void valitseKorttiPois() {
        onkoKorttiaValittuna = false;
    }

    /**
     * Palautetaan totuusarvo "ovatko kortit pari" kysyttäessä.
     */
    public static boolean ovatkoKortitPari(Kuva a, Kuva b) {

        if (a.getTunniste() == b.getTunniste()) {
            return true;
        }
        return false;

    }
}
