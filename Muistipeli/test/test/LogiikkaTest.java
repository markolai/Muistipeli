package test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Logiikka.Kuva;
import Logiikka.Logiikka;
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
public class LogiikkaTest {

    private Logiikka logiikka;

    public LogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        Logiikka logiikka = new Logiikka();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void vaikeustasoAlussaOikein() {

        assertEquals(1, logiikka.getVaikeus());

    }

    @Test
    public void arvauksetAlussaOikein() {

        assertEquals(0, logiikka.getArvaukset());

    }

    @Test
    public void ovatkoKortitPariToimii() {

        Kuva korttiA = new Kuva(1);
        Kuva korttiB = new Kuva(2);
        assertEquals(false, logiikka.ovatkoKortitPari(korttiA, korttiB));

    }

    @Test
    public void ovatkoKortitPariToimii2() {

        Kuva korttiA = new Kuva(1);
        Kuva korttiB = new Kuva(1);
        assertEquals(true, logiikka.ovatkoKortitPari(korttiA, korttiB));

    }
    
    @Test
    public void onkoKorttiaValittunaAlussaOikein() {
        assertEquals(false, logiikka.onkoKorttiaValittuna());
    }
    
}