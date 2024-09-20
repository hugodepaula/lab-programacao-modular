package br.lpm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RevisaoAedTest {

    public static final RevisaoAed revisaoAed = new RevisaoAed();

    @Test
    void testFibLoop() {
        assertEquals(1, revisaoAed.fibLoop(1), "Testando o 1o elemento da série de Fibonacci");
        assertEquals(1, revisaoAed.fibLoop(2), "Testando o 2o elemento da série de Fibonacci");
        assertEquals(2, revisaoAed.fibLoop(3), "Testando o 3o elemento da série de Fibonacci");
        assertEquals(0, revisaoAed.fibLoop(-1), "Testando elemento negativo da série de Fibonacci");
    }

    @Test
    void testFibRec() {
        assertEquals(1, revisaoAed.fibRec(1), "Testando o 1o elemento da série de Fibonacci");
        assertEquals(1, revisaoAed.fibRec(2), "Testando o 2o elemento da série de Fibonacci");
        assertEquals(2, revisaoAed.fibRec(3), "Testando o 3o elemento da série de Fibonacci");
        assertEquals(0, revisaoAed.fibRec(-1), "Testando elemento negativo da série de Fibonacci");
    }
}
