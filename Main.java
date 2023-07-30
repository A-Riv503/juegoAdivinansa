import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*crea una clase llamada juegoAdivinarNumeros que represente un juego donde la computadora genera un numero aleatorio entre 1 y 50, y el jugador debe adivinar
        * ese numero. la clase debe recivir metodos para recibir el intento del jugador, compararlo con el numero generardo y mostrar si el jugador adivino o el numero
        * es mayor o menor, el juego debe de continuar hasta que el jugador advine numero*/


        JuegoAdivinarNumeros juego=new JuegoAdivinarNumeros();
        juego.jugar();


    }
}