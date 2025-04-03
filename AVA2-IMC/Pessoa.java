// Define a classe Pessoa que armazena os dados básicos de uma categoria de objetos de pessoa
public class Pessoa {
    // Atributos privados para encapsulamento
    private final String nomePessoa;       // Nome da pessoa
    private final float pesoPessoa;       // Peso da pessoa (em kg)
    private final float alturaPessoa;     // Altura da pessoa (em metros)
    
    // Construtor que inicializa os atributos com os valores fornecidos
    public Pessoa(String nome, float peso, float altura) {
        this.nomePessoa = nome;       // Atribui o parâmetro 'nome' ao atributo 'nomePessoa'
        this.pesoPessoa = peso;       // Atribui o parâmetro 'peso' ao atributo 'pesoPessoa'
        this.alturaPessoa = altura;   // Atribui o parâmetro 'altura' ao atributo 'alturaPessoa'
    }
    
    /* 
       Os métodos getNome(), getPeso() e getAltura() permitem acessar os valores dos atributos privados da classe Pessoa. 
       Como os atributos são declarados como private, estes métodos fornecem uma forma controlada de leitura dos dados armazenados.
    */

    // Retorna o nome da pessoa
    public String getNome() {
        return nomePessoa;
    }
    
    // Retorna o peso da pessoa
    public float getPeso() {
        return pesoPessoa;
    }
    
    // Retorna a altura da pessoa
    public float getAltura() {
        return alturaPessoa;
    }
}

