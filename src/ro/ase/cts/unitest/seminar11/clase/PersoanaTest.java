package ro.ase.cts.unitest.seminar11.clase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetGenMint2000() {
        Persoana persoana = new Persoana("Matei","12344452");
        Assert.assertEquals("M",persoana.getGen());
    }

    @Test
    public void testGetGenFdup2000() {
        Persoana persoana = new Persoana("Matei","1841218224661");
        assertEquals("F", persoana.getGen());
    }

    @Test
    public void testCheckCNP() {
        Persoana persoana = new Persoana("Matei","1841218224661");
        Assert.assertTrue(persoana.checkCNP());
    }

    @Test
    public void testGetVarstaBoundaryInf2000() {
        Persoana persoana = new Persoana("Matei","5260514324661");
        Assert.assertEquals("0",persoana.getVarsta());
    }

    @Test
    public void testGetGenCrossCheck() {
        String CNP = "5260514324661";
        Persoana persoana = new Persoana("Matei",CNP);

        String expected;
        String actual=persoana.getGen();

        if(CNP.charAt(0)%2==0)
            expected="F";
        else
            expected="M";

        Assert.assertEquals(expected,actual);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCheckLungimeCNP() {
        Persoana persoana = new Persoana("Matei","24661");
        persoana.checkCNP();
    }
}