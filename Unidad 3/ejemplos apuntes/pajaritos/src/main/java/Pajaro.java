
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rfort
 */
// Creamos la clase Pajaro

public class Pajaro {

    String nombre;
    int posX;
    int posY;

    //creamos el constructor Pajaro
    public Pajaro() {

    }

    //Creamos el objeto Pajaro
    public Pajaro(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    //Creamos el método volar
    double volar (int posX, int posY){
        
        double desplazamiento = Math.sqrt( posX*posX + posY*posY );
        this.posX = posX;
        this.posY = posY;
        
        return desplazamiento;

    }

    //Creamos el programa que utilizará el objeto Pajaro con el método volar
    public static void main(String[] args) {

        Pajaro loro = new Pajaro("Lucy", 50, 50);
        double d = loro.volar(50, 50);
        System.out.println("El desplazamiento ha sido " + d);
        //System.out.printf("El desplazamiento ha sido %.2f", d); así nos daría el resultado con dos decimales nada más

    }
}
