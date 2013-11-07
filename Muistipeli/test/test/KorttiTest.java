package test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Logiikka.Kortti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author markolai
 */
public class KorttiTest {

    private Kortti kortti;

    public KorttiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void onkoKortinTunnisteOikein() {
        Kortti korttiA = new Kortti(1);
        assertEquals(1, korttiA.getTunniste());
    }

    @Test
    public void onkoKorttiKaannetty() {
        Kortti korttiA = new Kortti(1);
        assertEquals(false, korttiA.getKaannetty());
    }

    @Test
    public void toimiikoKortinKaantaminen() {
        Kortti korttiA = new Kortti(1);
        korttiA.kaannaKortti();
        assertEquals(true, korttiA.getKaannetty());
    }
    
        @Test
    public void toimiikoKortinKaantaminen2() {
        Kortti korttiA = new Kortti(1);
        korttiA.kaannaKortti();
        korttiA.kaannaKortti();
        assertEquals(false, korttiA.getKaannetty());
    }
}