
package aplicanim;

public class Reptil extends Animal{
  private  String corEscama;
  
  @Override 
  public  void locomover(){
   System.out.println("Rastejando");

  
  }

    @Override
    public void alimentar() {
  System.out.println("Comendo carne");

    }

    @Override
    public void emitirSom() {
     System.out.println("Som de reptil");

    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
