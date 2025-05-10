package lanchonete.classes;

public class Entradas extends Scanner {
    public static int menuInv(int entrada){
        entrada=sc.nextInt();
        while(entrada>6|entrada<0){
            System.out.println("\nA escolha é inválida, escolha de acordo com o menu.");
            Menus.menu();
            entrada=sc.nextInt();
        }
        return entrada;
    }
    public static int navegarInv(int entrada){
        entrada=sc.nextInt();
        while(entrada>5|entrada<0){
            System.out.println("\nA escolha é inválida, escolha de acordo com o cardapio.");
            entrada=sc.nextInt();
        }
        return entrada;
    }
    public static int comprarVoltar(int entrada){
        entrada=sc.nextInt();
        while(entrada>3|entrada<0){
            System.out.println("\nA escolha é inválida.");
            entrada=sc.nextInt();
        }
        return entrada;
    }
    public static String cartao(){
        String entrada;
        sc.nextLine();
        do{entrada=sc.nextLine();
           System.out.println("Senha Incorreta, tente novamente.(Tente:admin)");
        }while(!entrada.equals("admin"));
        return "\nSenha correta!\n";
    }
}
