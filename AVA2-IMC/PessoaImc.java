import java.util.Scanner;  // Importa a classe Scanner para leitura de dados

// Classe PessoaImc para executar o programa e testar a funcionalidade das classes Pessoa e Imc
public class PessoaImc {
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada de dados 
        Scanner entradaDados = new Scanner(System.in);
        // Entrada do nome da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nome = entradaDados.nextLine();
            
        // Entrada do peso da pessoa (em kg)
        System.out.print("Digite o peso da pessoa (em kg): ");
        float peso = entradaDados.nextFloat();
            
        // Entrada da altura da pessoa (em metros)
        System.out.print("Digite a altura da pessoa (em metros): ");
        float altura = entradaDados.nextFloat();
            
        // Cria um objeto pessoa com os dados informados nas entradas
        Pessoa pessoa = new Pessoa(nome, peso, altura);
            
        // Cria um objeto imc utilizando os dados obtidos através dos getters da classe Pessoa
        Imc imc = new Imc(pessoa.getPeso(), pessoa.getAltura(), pessoa.getNome());
            
        // Chama o método público mostrarImc() para exibir os resultados do cálculo do IMC
        imc.mostrarImc();

        // Fecha o objeto entradaDados
        entradaDados.close();
        
    }
}
