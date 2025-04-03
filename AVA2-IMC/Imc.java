// Define a classe Imc que realiza o cálculo, análise e exibição do índice de massa corporal
public class Imc {
    // Atributos privados para armazenar os dados necessários
    private float pesoImc;      // Peso usado no cálculo (em kg)
    private float alturaImc;    // Altura usada no cálculo (em metros)
    private String nomeImc;     // Nome da pessoa para identificação
    private float resultadoImc; // Valo do resultado do cálculo do IMC
    
    // Construtor que inicializa os atributos com os valores fornecidos
    public Imc(float peso, float altura, String nome) {
        this.pesoImc = peso;         // Atribui o parâmetro 'peso' ao atributo 'peso'
        this.alturaImc = altura;     // Atribui o parâmetro 'altura' ao atributo 'altura'
        this.nomeImc = nome;         // Atribui o parâmetro 'nome' ao atributo 'nome'
        this.resultadoImc = calcularImc(); //Atribui o resultado do método calcularImc() para o atributo 'resultadoImc'
    }
    
    /*
       Método para calcular o IMC usando a fórmula: peso / (altura²)
       O método analisarImc() é privado para que a lógica interna não seja acessível diretamente por outras classes, mantendo o encapsulamento.
    */
    private float calcularImc() {
        return pesoImc / (alturaImc * alturaImc);
    }
    
    /*
       Método para analisar o valor do IMC e retornar uma classificação
       O método analisarImc() é privado para que a lógica interna não seja acessível diretamente por outras classes, mantendo o encapsulamento.
    */
    private String analisarImc() {
        // Verifica as faixas de IMC e retorna a classificação adequada e sua respectiva análise
        if (resultadoImc < 18.5) {
            return "BAIXO DO PESO - É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas e riscos associados.";
        } else if (resultadoImc <= 24.9) {
            return "PESO ADEQUADO - Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal.";
        } else if (resultadoImc <= 29.9) {
            return "SOBREPESO - sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.";
        } else if (resultadoImc <= 34.9) {
            return "OBSESIDADE GRAU I - É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.";
        } else if (resultadoImc <= 39.9) {
            return "OBSESIDADE GRAU II - Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.";            
        } else {
            return "OBSESIDADE GRAU III - Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.";
        }
    }

    /*
       Método que exibe os dados e o resultado do cálculo do IMC.
       O método mostrarImc() é público e chama esses métodos internamente para apresentar os resultados.
    */
    public void mostrarImc() {
        // Utiliza os métodos privados para calcular e analisar o IMC
        String analiseImc = analisarImc();
        System.out.println("--- Resultado do IMC ---");
        System.out.printf("Nome: %s \n", nomeImc);
        System.out.printf("Altura: %.2f m \n", alturaImc);
        System.out.printf("IMC: %.2f \n", resultadoImc);
        System.out.printf("Análise: %s \n",analiseImc);
    }
}
