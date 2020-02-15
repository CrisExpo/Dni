package edu.elsmancs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DNITest {
    private static final char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};

    private static final String[] casosTestPass = { //casos OK
            "78484464T", "72376173A", "01817200Q", "95882054E", "63587725Q",
            "26861694V", "21616083Q", "26868974Y", "40135330P", "89044648X",
            "80117501Z", "34168723S", "76857238R", "66714505S", "66499420A"};

    @Test
    public void getParteNumericaDni_stringEsNumero() {
        DNI objetoDniCif = null;
        for (String dni : casosTestPass) {
            objetoDniCif = new DNI(dni);
            assertTrue(objetoDniCif.isDniNumero(
                    objetoDniCif.extraerParteNumericaDni()));
        }
    }
}
