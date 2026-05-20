import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int operacao;    
    do{

        Funcoes.menu();
        operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("digite qual produto você quer adicionar e a quantidade: ");
                break;
            case 2:
                System.out.println("lista de produtos");
                break;
            case 3:
                System.out.println("qual produto voce quer atualizar");
                break;
            case 4:
                System.out.println("Selecione o produto que deseja excluir");
                break;
            case 0:
                System.out.println("Parando funcionamento");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
            }

    }while (operacao != 0);
        entrada.close();  
        System.out.println("sistema encerrado");
    }
}



