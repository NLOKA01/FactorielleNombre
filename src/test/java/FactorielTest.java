import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorielTest {

    @Test
    void testCalculeFactorielCasNormaux() {
        assertEquals(1, Factoriel.calculeFactoriel(1), "Factoriel de 1 doit être 1");
        assertEquals(120, Factoriel.calculeFactoriel(5), "Factoriel de 5 doit être 120");
        assertEquals(720, Factoriel.calculeFactoriel(6), "Factoriel de 6 doit être 720");
    }

    @Test
    void testCalculeFactorielGrandNombre() {
        assertEquals(479001600, Factoriel.calculeFactoriel(12), "Factoriel de 12 doit être 479001600");
    }

    @Test
    void testCalculeFactorielAvecZero() {
        assertEquals(1, Factoriel.calculeFactoriel(0), "Factoriel de 0 doit être 1");
    }
}
