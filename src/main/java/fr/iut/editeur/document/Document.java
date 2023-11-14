package fr.iut.editeur.document;
/**
 * Classe qui représente le document
 */
public class Document {

    /**
     * le texte du document
     */
    private String texte;

    /**
     * Constructeur par défaut
     */

    public Document() {
        this.texte = "";
    }
    public String getTexte() {
        return texte;
    }
    /**
     * modifie le texte du document
     * @param texte modifie le texte du document
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * ajoute du texte au document {@link fr.iut.editeur.commande.CommandeAjouter}
     * @param texte ajoute du texte au document
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * remplace le texte entre start et end par remplacement {@link fr.iut.editeur.commande.CommandeRemplacer}
     * @param start commance à la position start
     * @param end fini à la position end
     * @param remplacement remplace le texte entre start et end par remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * met les lettre en majuscules {@link fr.iut.editeur.commande.CommandeMajuscules}
     * @param start commance à la position start
     * @param end fini à la position end
     */
    public void majuscules(int start, int end) {
        String chaineMaj = texte.substring(start, end).toUpperCase();
        remplacer(start, end, chaineMaj);
    }

    /**
     * efface le texte entre start et end {@link fr.iut.editeur.commande.CommandeEffacer}
     * @param start commance à la position start
     * @param end fini à la position end
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * efface tout le texte {@link fr.iut.editeur.commande.CommandeClear}
     */
    public void clear (){
        texte = "";
    }
}
