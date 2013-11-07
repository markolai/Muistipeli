/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

/**
 *
 * @author markolai
 */
public class Kortti {
   /**
 *
 * Alustetaan kortin tunniste ja kortin kääntämisen totuusarvo epätodeksi.
 */ 
    
    private int tunniste;
    private boolean kaannetty = false;
/**
 *
 * Uuden kortin konstruktori, joka saa parametrina uuden kortin tunnisteen.
 */
    public Kortti(int tunniste) {
        
        this.tunniste = tunniste;
    }
    
    public void kaannaKortti() {
        
        if (this.kaannetty == true) {
            this.kaannetty = false;
        } else this.kaannetty = true;

    }
    
    public int getTunniste() {
        return this.tunniste;
    }
    
    public boolean getKaannetty() {
        return this.kaannetty;
    }
    
}
