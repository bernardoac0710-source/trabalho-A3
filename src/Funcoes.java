public class Funcoes {
    
    public static void menu(){
       
        String[] menuItens = {
            "--- MENU DE OPERAÇÕES ---",
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
            int espacos = (larguraTerminal - linha.length()) / 2;
            String formato = "%" + (espacos + linha.length()) + "s%n";
            System.out.printf(formato, linha);
        }
        
    }
    


    
}
