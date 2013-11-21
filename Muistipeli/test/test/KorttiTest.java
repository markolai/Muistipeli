package test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Logiikka.Kuva;
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

    private Kuva kortti;

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
        Kuva korttiA = new Kuva(1);
        assertEquals(1, korttiA.getTunniste());
    }

    @Test
    public void onkoKorttiKaannetty() {
        Kuva korttiA = new Kuva(1);
        assertEquals(false, korttiA.getKaannetty());
    }

    @Test
    public void toimiikoKortinKaantaminen() {
        Kuva korttiA = new Kuva(1);
        korttiA.kaannaKuva();
        assertEquals(true, korttiA.getKaannetty());
    }
    
        @Test
    public void toimiikoKortinKaantaminen2() {
        Kuva korttiA = new Kuva(1);
        korttiA.kaannaKuva();
        korttiA.kaannaKuva();
        assertEquals(false, korttiA.getKaannetty());
    }
}