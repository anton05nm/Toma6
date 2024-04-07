
/*
* Representa la baraja del juego Toma 6, en total 104 cartas, enumeradas del 1 al 104 con el número de bueyes
* correspondiente en función del valor de la misma (revisar condiciones en el enunciado del juego). 
* Estructura: se utilizará un TAD adecuado
* Funcionalidad: barajar las cartas, devolver la carta situada encima del montón de cartas
 */
package gal.uvigo.esei.aed1.Toma6.core;



public class Baraja {

    private Carta baraja[];
    public final int TOTAL_CARTAS = 104;

    public void setBaraja() {
        for (int i = 1; i <= TOTAL_CARTAS; i++) {
            baraja[i].setNumero(i);
            if ( baraja[i].getNumero() == 55) {
                baraja[i].setNbueyes(7);
            } else if (baraja[i].getNumero()% 10 == 0){
                baraja[i].setNbueyes(3);
            } else if (baraja[i].getNumero()% 5 == 0){
                baraja[i].setNbueyes(2);
            } else if (baraja[i].getNumero()% 11 == 0){
                baraja[i].setNbueyes(5);
            } else {
                baraja[i].setNbueyes(1);
            }
        }
    }
    
}
