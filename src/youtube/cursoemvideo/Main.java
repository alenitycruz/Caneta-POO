package youtube.cursoemvideo;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.carga = 80;
        c1.cor = "Preta";
        c1.ponta = 0.7f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
