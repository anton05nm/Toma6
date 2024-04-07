
/*
 * Representa una carta, formada por un número y la cantidad de bueyes correspondiente
 */
package gal.uvigo.esei.aed1.Toma6.core;

public class Carta {
    private int numero;
    private int nbueyes;

    public Carta(int numero, int nbueyes) {
        this.numero = numero;
        this.nbueyes = nbueyes;
    }

    public int getNumero() {
        return numero;
    }

    public int getNbueyes() {
        return nbueyes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNbueyes(int nbueyes) {
        this.nbueyes = nbueyes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carta{");
        sb.append("numero=").append(numero);
        sb.append(", nbueyes=").append(nbueyes);
        sb.append('}');
        return sb.toString();
    }

    
}
