public class TestaConta {
    public static void main(String[] args) {

        //Construtor data de abertura
        Data dataConta1 = new Data(10, 01, 2024);
        Data dataConta2 = new Data(11, 01, 2024);



        Conta conta1 = new Conta(dataConta1); //Constrututor padrão | Sem parametro
        Conta conta2 = new Conta("Fábio",dataConta2); // construtor com parâmetro | informando o parâmetro

        System.out.println("Conta 1 - Titular: " + conta1.getTitular() + ", Identificador: " + conta1.getIdentificador() + " Data de abertura: " + conta1.getDataAbertura());
        System.out.println("Conta 2 - Titular: " + conta2.getTitular() + ", Identificador: " + conta2.getIdentificador() + " Data de abertura: " + conta2.getDataAbertura());
    }
}
