package lanchonete.classes;

import java.util.ArrayList;
import java.util.List;

public class Carrinho{
    public static double total=0;
    public static List<String> carrinho = new ArrayList<>();
    
    public static void adicionar(String nProduto, double preco){
        carrinho.add(nProduto);
        total+=preco;
    } 
    public static void carrinho(){
        int entrada = 1;
        String confirm;
        Menus.carrinhoMenu();
        entrada = Entradas.comprarVoltar(entrada);
        if (entrada==1|entrada==2){
            System.out.println("\nAproxime ou insira o cartão!");
            System.out.print("Digite a senha: ");
            confirm = Entradas.cartao();
            System.out.println(confirm);
            Menus.carrinhoFinal();
        }else{
            Menus.qrCodeSimulado();
            Menus.carrinhoFinal();
        }
        }
    }
    
