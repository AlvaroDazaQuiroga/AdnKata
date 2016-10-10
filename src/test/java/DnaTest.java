import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for @{Link DnaStrand}.
 */
public class DnaTest {

    /**
     * test for the replace method.
     */
    @Test
    public void adnTest() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
        assertEquals("TAATATCCGGTAGC", DnaStrand.makeComplement("ATTATAGGCCATCG"));
    }
}
