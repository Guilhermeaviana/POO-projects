
package exerpessoalivro;

public class ExerPessoaLivro {

    public static void main(String[] args) {
        
        Livro[] l = new Livro[3];
        Pessoa[] p = new Pessoa[2];
        
        p[0] = new Pessoa("Julio", 33, "Masculino");
        p[1] = new Pessoa("Renata", 25, "Feminino");
        
        l[0] = new Livro("Harry Potter", "Jk rowling" , 257, p[1]);
        
        l[0].abrir();
        l[0].avançarPag();
        l[0].detalhes();
       
        
    }
    
}
