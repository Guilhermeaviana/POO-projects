
package ufc;

public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.empates = em;
        this.derrotas = de;
        
    }
    
    
    
    public void apresentar(){
        System.out.println("---------------------------------");
        System.out.println("Ladies and gentleman, com voces: " + getNome());
        System.out.println("Nacionalidade:" + this.getNacionalidade());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Peso:" + this.getPeso());
        System.out.println("Altura:" + this.getAltura());
        System.out.println("Vitorias:" + this.getVitorias());
        System.out.println("Derrotas:" + this.getDerrotas());
        System.out.println("Empates:" + this.getEmpates());
    }
    
    public void status(){
     
     System.out.println(this.getNome() + " da categoria " + getCategoria());
     System.out.println("Com " + getVitorias() + " vitorias");
     System.out.println(getDerrotas() + " derrotas");
     System.out.println(getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String no){
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso<52.2){ 
            this.categoria = "Invalido";
        } 
        else if(this.peso<=70.3){
            this.categoria = "Leve";
        }
        else if(this.peso<=83.9){
            this.categoria = "Medio";
        }
        else if(this.peso<=120.2){
            this.categoria = "Pesado";
        }
        else{
        this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
    
    
}
