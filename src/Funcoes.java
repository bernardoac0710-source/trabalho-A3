public class Funcoes {
    
    public static void menu(){ // funçao criada para chamar o menu sempre que se precisar sem ficar repetindo linhas e linhas de codigo
       
        String[] menuItens = {
            "--- MENU DE OPERAÇÕES ---",                //tranforma todo o menu em linhas para poder ser centralizado no terminal
            "1: Cadastrar produtos",                    
            "2: Listar produtos",
            "3: Atualizar produto",
            "4: Excluir produto",
            "0: Sair",
            "Digite qual operação você quer entrar:"
        };

        // Largura padrão do terminal
        int larguraTerminal = 80;

        for (String linha : menuItens) {                        
            // Calcula os espaços necessários para centralizar
            int espacos = (larguraTerminal - linha.length()) / 2;   //Calcula quantos espaços em branco são necessários para centralizar o texto   
            String formato = "%" + (espacos + linha.length()) + "s%n";   //Cria uma formataçao do texto centralizado              
            System.out.printf(formato, linha);  //imprime o menu de forma centralizada
        }
        
    }
    
}
