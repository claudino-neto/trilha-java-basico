package pilares_poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12345");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("98765");
    }
}
