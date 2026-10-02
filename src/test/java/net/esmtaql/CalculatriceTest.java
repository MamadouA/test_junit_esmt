package net.esmtaql;

import org.junit.jupiter.api.*;
import java.time.Instant;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {
    private static Calculatrice calculatrice;
    private static Instant debut;
    private static  Instant fin;

    @BeforeAll
    public static void afficherDebut() {
        calculatrice = new Calculatrice();
        debut = Instant.now();
        System.out.print("\nLancement des tests: " + Instant.now());
    }

    @AfterAll
    public static  void afficherFin() {
        calculatrice = null;
        fin = Instant.now();
        System.out.print("Durée des tests: " + (fin.toEpochMilli() - debut.toEpochMilli()) + "ms");
    }

    @Test
    public void testAdditionnerDeuxNombresPositifs(){
        // Arrange
        int nombre1 = 10;
        int nombre2 = 25;

        // Act
        int résultatObtenu = calculatrice.add(nombre1, nombre2);

        // Assert
        assertEquals(35, résultatObtenu);
    }

    @Test
    public void testMultiplicationDeuxNombresPositifs() {
        // Arrange
        int nombre1 = 2;
        int nombre2 = 50;

        // Act
        int resultat = calculatrice.multiplier(nombre1, nombre2);

        // Assert
        assertEquals(100, resultat);
    }

    @Test
    public void testSoustractionDeuxNombresPositifs() {
        // Arrange
        int nombre1 = 125;
        int nombre2 = 75;

        // Act
        int resultat = calculatrice.soustraire(nombre1, nombre2);

        // Assert
        assertEquals(50, resultat);
    }

    @Test
    public void testDivisionDeuxNombresPositifs() {
        // Arrange
        int nombre1 = 16;
        int nombre2 = 2;

        // Act
        int resultat = calculatrice.diviser(nombre1, nombre2);

        // Assert
        assertEquals(8, resultat);
    }
}