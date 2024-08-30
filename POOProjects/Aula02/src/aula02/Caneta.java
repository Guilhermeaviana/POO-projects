package aula02;

public class Caneta {
    String modelo;
   private String cor;
    float ponta;
    boolean tampada;
    
    void status(){
        System.out.println("A cor e: " + this.cor);
        System.out.println("O modelo e: " + this.modelo);
        System.out.println("A ponta e: " + this.ponta);
        System.out.println("ela esta tampada?: " + this.tampada);
    }
    
    
    
    public void colorir(){
        this.cor = "Azul";
    }
    
    public void tampar() {}
    
    void destampar(){}
            
}
