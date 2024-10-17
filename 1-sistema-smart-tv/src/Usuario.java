public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual? " + smartTv.volume);
        smartTv.mudarCanal(9);
        System.out.println("Novo Status -> Qual canal? " + smartTv.canal);
    }
}
