package lanchonete.classes.cardapio;

import lanchonete.classes.Carrinho;
import lanchonete.classes.Entradas;
import lanchonete.classes.Informacoes;
import lanchonete.classes.Menus;
import lanchonete.classes.Produto;
import lanchonete.classes.Scanner;

public class Bebidas extends Scanner {

    public static void alcolicas() {
        int navegar = 0, confirm=0;
        do {
            Menus.bebidasAlcoolicas();
            navegar = Entradas.navegarInv(navegar);
            switch (navegar) {
                case 1:
                    Informacoes.bebidaAlcoolica1();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.cerveja.nome, Produto.cerveja.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 2:
                    Informacoes.bebidaAlcoolica2();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.vinho.nome, Produto.vinho.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 3:
                    Informacoes.bebidaAlcoolica3();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.caipirinha.nome, Produto.caipirinha.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 4:
                    Informacoes.bebidaAlcoolica4();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.whisky.nome, Produto.whisky.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 5:
                    break;
            }
        } while (navegar != 5);
    }

    public static void naoAlcolicas() {
        int navegar = 0, confirm=0;
        do {
            Menus.bebidasNaoAlcoolicas();
            navegar = Entradas.navegarInv(navegar);
            switch (navegar) {
                case 1:
                    Informacoes.bebidaNaoAlcoolica1();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.refri.nome, Produto.refri.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 2:
                    Informacoes.bebidaNaoAlcoolica2();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.suco.nome, Produto.suco.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 3:
                    Informacoes.bebidaNaoAlcoolica3();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.agua.nome, Produto.agua.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 4:
                    Informacoes.bebidaNaoAlcoolica4();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.cha.nome, Produto.cha.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 5:
                    break;
            }
        } while (navegar != 5);
    }
}
