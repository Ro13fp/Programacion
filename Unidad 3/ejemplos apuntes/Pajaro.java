public class Pajaro {
    String nombre;
    int posX;
    int posY;

    public Pajaro() {

    }

    public Pajaro(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    double volar(int posX, int posY) {
        double desplazamiento = Math.sqrt(posX * posX + posY * posY);
        this.posX = posX;
        this.posY = posY;
        return desplazamiento;

    }

    public static void main(String[] args) {
        Pajaro urraca = new Pajaro("Selma", 10, 20);
        double d = urraca.volar(10, 20);
        System.out.println("El desplazamiento ha sido " + d);

    }
}