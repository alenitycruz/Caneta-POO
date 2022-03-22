package youtube.cursoemvideo;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    public void status(){
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Cor " + this.getCor());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Carga " + this.getCarga());
        System.out.println("Está tampada - " + this.isTampada());
    }

    public Caneta() {
        tampar();
        this.setModelo("Faber Castel");
        this.setPonta(0.7f);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void rabiscar()  {
        if (tampada == true) {
            System.out.println("ERRO! Não é possível escrever!");
        } else if (tampada == false) {
            System.out.println("Pode escrever!");
        }

    }

    protected void tampar() {
        this.tampada = true;

    }

    protected void destampar(){
        this.tampada = false;

    }
}
