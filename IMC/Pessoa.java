public class Pessoa {
    public String nomePessoa;
    public double pesoPessoa;
    public double alturaPessoa;
    public double imcPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;

        //Fórmula do IMC = Peso ÷ (Altura × Altura)
        this.imcPessoa = pesoPessoa / (alturaPessoa * alturaPessoa);
    }

    public void mostrarPessoa(){
        System.out.println("Nome:" + this.nomePessoa);
        System.out.println("Peso:" + this.pesoPessoa);
        System.out.println("Altura:" + this.alturaPessoa);
        System.out.println("IMC:" + this.imcPessoa);
    }

}
