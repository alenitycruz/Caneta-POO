package youtube.cursoemvideo;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //c1.setModelo("BIC");
        c1.setCarga(80);
        c1.setCor("Preta");
        //c1.setPonta(0.7f);
        c1.tampar();
        c1.status();
        c1.rabiscar();

        // Antiga fórmula
        Caneta c2 = new Caneta();
        //c2.modelo = "Faber Castel";
        c2.cor = "Azul";
       // c2.setPonta(0.5f); //menos esse
        c2.carga = 80;
        c2.destampar();
        c2.status();
        System.out.println("O melhor modelo de caneta é o " + c2.getModelo()); //e esse
        c2.rabiscar();
    }
}
