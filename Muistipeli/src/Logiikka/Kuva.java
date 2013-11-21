/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

/**
 *
 * @author markolai
 */
public class Kuva {
   /**
 *
 * Alustetaan muistettavan kuvan tunniste ja kuvan kääntämisen/löytämisen totuusarvo epätodeksi.
 */ 
    
    private int tunniste;
    private boolean kaannetty;
    private boolean loydetty;
/**
 *
 * Uuden kortin konstruktori, joka saa parametrina uuden kuvan tunnisteen.
 */
    public Kuva(int tunniste) {
        
        this.tunniste = tunniste;
        this.kaannetty = false;
        this.loydetty = false;
    }
    
    public void kaannaKuva() {
        
        if (this.kaannetty == true) {
            this.kaannetty = false;
        } else this.kaannetty = true;

    }
    
    
        
    /**
 *
 * Verrataan kahta kuvaa toisiinsa, ovatko pari.
 *
 */
//    public boolean vertaaKuvia(Kuva kuva) {
//        
//        if (kuva.getTunniste()==this.tunniste) {
//        
//        kuva.loydetty = true;
//        this.loydetty = true;
//        
//        return true;
//        
//    } return false;
//    
//    }
    
    public int getTunniste() {
        return this.tunniste;
    }
    
    public boolean getKaannetty() {
        return this.kaannetty;
    }

    boolean loydetty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
