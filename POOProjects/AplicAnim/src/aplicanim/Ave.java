
package aplicanim;

public class Ave extends Animal {
    
 private String corPena;
 
 public void fazerNinho(){
                 System.out.println("Ninho feito");

 }

    @Override
    public void locomover() {
                        System.out.println("voar");

    }

    @Override
    public void alimentar() {
                        System.out.println("Comendo bicho");

    }

    @Override
    public void emitirSom() {
                        System.out.println("Barulho ave");

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

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
  
  
    
}
