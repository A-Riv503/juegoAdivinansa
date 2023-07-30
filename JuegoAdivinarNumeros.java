import javax.swing.*;

public class JuegoAdivinarNumeros {

    int numMaquina;
    int numJugador;

    public JuegoAdivinarNumeros(){
        numMaquina=(int)(Math.random()*50)+1;

    }


    public void jugar(){
        int intento;

        do{

            intento=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numerp entre el 1 y 50 "));

            if(intento==numMaquina){
                System.out.println("Felicidades, has adivinado el numero "+intento);
            }else if(intento<numMaquina){
                System.out.println("te haz equivocado el numero ingresado es menor, intentalo nuevamente");
            }else{
                System.out.println("te haz equivocado el numero ingresado es mayor, intentalo nuevamente");
            }

        }while(intento!=numMaquina);
    }
}
