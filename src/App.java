import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int operacao;    
    do{   // do while funciona de forma que o codigo continue rodando enquanto certa condiçao nao for atendida

        Funcoes.menu(); // puxa a funçao menu do objeto funçoes
        operacao = entrada.nextInt();  // cria a variavel operacao para se utilizar o switch em casos diferentes
        switch (operacao) {
            case 1: // caso 1 adiciona algum produto e sua quantidade
                System.out.println("digite qual produto você quer adicionar e a quantidade: ");
                break;
            case 2: // caso 2 mostra a lista de produtos 
                System.out.println("lista de produtos");
                break;
            case 3: // caso 3 atualiza os produtos existentes
                System.out.println("qual produto voce quer atualizar");
                break;
            case 4: // caso 4 exclui o produto selecionado
                System.out.println("Selecione o produto que deseja excluir");
                break;
            case 0: // caso 0 encerra o sistema
                System.out.println("Parando funcionamento");
                break;
            default: // default é usado para quando nenhum dos casos sao selecionados
                System.out.println("Opção inválida! Tente novamente.");
                break;
            }

    }while (operacao != 0); // enquanto nao for selecionado o caso 0 o codigo continuara rodando sempre que um caso é encerrado
        entrada.close();  
        System.out.println("sistema encerrado");
    }
}



