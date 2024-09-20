package br.lpm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ImcTest {

    @Test
    public void testGetImc() {
        Imc imc = new Imc();
        imc.altura = 1.8F;
        imc.peso = 80;
        assertEquals(24.69F, imc.getImc(), 0.01F);
    }
}
