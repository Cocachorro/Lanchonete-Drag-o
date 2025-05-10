package lanchonete.classes.cardapio;

import lanchonete.classes.Carrinho;
import lanchonete.classes.Entradas;
import lanchonete.classes.Informacoes;
import lanchonete.classes.Menus;
import lanchonete.classes.Produto;
import lanchonete.classes.Scanner;

public class Comidas extends Scanner {
    
    public static void sand() {
        int navegar = 0, confirm=0;
        do {
            Menus.sanduiches();
            navegar = Entradas.navegarInv(navegar);
            switch (navegar) {
                case 1:
                    Informacoes.sanduiche1();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.xBurguer.nome, Produto.xBurguer.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 2:
                    Informacoes.sanduiche2();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.xSalada.nome, Produto.xSalada.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 3:
                    Informacoes.sanduiche3();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.xBacon.nome, Produto.xBacon.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 4:
                    Informacoes.sanduiche4();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.xEgg.nome, Produto.xEgg.preco);
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

    public static void pasteis() {
        int navegar = 0, confirm=0;
        do {
            Menus.pasteis();
            navegar = Entradas.navegarInv(navegar);
            switch (navegar) {
                case 1:
                    Informacoes.pastel1();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.pCarne.nome, Produto.pCarne.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 2:
                    Informacoes.pastel2();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.pQueijo.nome, Produto.pQueijo.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 3:
                    Informacoes.pastel3();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.pPizza.nome, Produto.pPizza.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 4:
                    Informacoes.pastel4();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.pChoco.nome, Produto.pChoco.preco);
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

    public static void sorvete() {
        int navegar = 0, confirm=0;
        do {
            Menus.sorvetes();
            navegar = Entradas.navegarInv(navegar);
            switch (navegar) {
                case 1:
                    Informacoes.sorvete1();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.sBauni.nome, Produto.sBauni.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 2:
                    Informacoes.sorvete2();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.sChoco.nome, Produto.sChoco.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 3:
                    Informacoes.sorvete3();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.sMoran.nome, Produto.sMoran.preco);
                    else if (confirm==2){
                        break;
                    }else
                        navegar=5;
                    break;
                case 4:
                    Informacoes.sorvete4();
                    confirm=Entradas.comprarVoltar(confirm);
                    if(confirm==1)
                        Carrinho.adicionar(Produto.sundae.nome, Produto.sundae.preco);
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
