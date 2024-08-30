
package aplicanim;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
                    System.out.println("Soltando bolha");

    }

    @Override
    public void locomover() {
                        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
                        System.out.println("Comendo substancias" );

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirSom() {
                        System.out.println("Peixe nao faz som");

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
    
    
}
