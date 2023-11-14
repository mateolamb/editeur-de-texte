package fr.iut.editeur.document;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;

public class DocumentTest extends TestCase {

    public void testGetTexte() {
        Document doc = new Document();
        doc.setTexte("test");
        assertEquals("test", doc.getTexte());
    }

    public void testSetTexte() {
        Document doc = new Document();
        doc.setTexte("test");
        assertEquals("test", doc.getTexte());
    }

    public void testAjouter() {
        Document doc = new Document();
        doc.ajouter("test");
        assertEquals("test", doc.getTexte());
    }

    public void testToString() {
        Document doc = new Document();
        doc.setTexte("test");
        assertEquals("test", doc.getTexte());
    }

    public void testRemplacer() {
        Document doc = new Document();
        doc.setTexte("test");
        doc.remplacer(0, 4, "yo");
        assertEquals("yo", doc.getTexte());
    }

    public void testMajuscules() {
        Document doc = new Document();
        doc.setTexte("test");
        doc.majuscules(0, 4);
        assertEquals("TEST", doc.getTexte());
    }

    public void testEffacer() {
        Document doc = new Document();
        doc.setTexte("test");
        doc.effacer(0, 4);
        assertEquals("", doc.getTexte());
    }
}
