
package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String c, String m, float p){
      this.cor = c;
      this.setModelo(m);
      this.setPonta(p);
      this.tampar();
    }
    
    
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;    
    }
    
    public void tampar(){
    this.tampada = true;
    }
    
    public void destampar(){
    this.tampada = false;
    }
    
    public void status(){
    System.out.println("A cor e:" + this.cor);
    System.out.println("A ponta e:" + this.getPonta());
    System.out.println("O modelo e:" + this.getModelo());
    System.out.println("A caneta esta?" + this.tampada);
    }
            
}
