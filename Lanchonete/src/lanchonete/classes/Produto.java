package lanchonete.classes;
public class Produto {
    public String nome;
    public double preco;
    public String desc;
    
// Sanduíches
    public static Produto xBurguer = new Produto("X-Burguer", 12.00f, "X-Burguer - Pão, carne e queijo\nPreço: R$ 12,00");
    public static Produto xSalada  = new Produto("X-Salada", 14.00f, "X-Salada - Pão, carne, queijo, alface e tomate\nPreço: R$ 14,00");
    public static Produto xBacon   = new Produto("X-Bacon", 16.00f, "X-Bacon - Pão, carne, queijo e bacon crocante\nPreço: R$ 16,00");
    public static Produto xEgg     = new Produto("X-Egg", 15.00f, "X-Egg - Pão, carne, queijo e ovo frito\nPreço: R$ 15,00");

    // Pastéis
    public static Produto pCarne     = new Produto("Pastel de Carne", 8.00f, "Pastel de Carne - Massa crocante recheada com carne moída\nPreço: R$ 8,00");
    public static Produto pQueijo    = new Produto("Pastel de Queijo", 8.00f, "Pastel de Queijo - Massa crocante recheada com queijo derretido\nPreço: R$ 8,00");
    public static Produto pPizza     = new Produto("Pastel de Pizza", 9.00f, "Pastel de Pizza - Queijo, presunto e orégano\nPreço: R$ 9,00");
    public static Produto pChoco = new Produto("Pastel de Chocolate", 10.00f, "Pastel de Chocolate - Doce, com recheio de chocolate\nPreço: R$ 10,00");

    // Sorvetes
    public static Produto sBauni = new Produto("Sorvete de Baunilha", 6.00f, "Sorvete de Baunilha - Tradicional e suave\nPreço: R$ 6,00");
    public static Produto sChoco = new Produto("Sorvete de Chocolate", 6.00f, "Sorvete de Chocolate - Cremoso e intenso\nPreço: R$ 6,00");
    public static Produto sMoran = new Produto("Sorvete de Morango", 6.00f, "Sorvete de Morango - Refrescante e doce\nPreço: R$ 6,00");
    public static Produto sundae = new Produto("Sundae Especial", 9.00f, "Sundae Especial - Com cobertura e granulado\nPreço: R$ 9,00");

    // Bebidas Não Alcoólicas
    public static Produto refri = new Produto("Refrigerante", 5.00f, "Refrigerante - Lata 350ml\nPreço: R$ 5,00");
    public static Produto suco = new Produto("Suco Natural", 7.00f, "Suco Natural - Suco delicioso de Laranja\nPreço: R$ 7,00");
    public static Produto agua = new Produto("Água Mineral", 3.00f, "Água Mineral - Com ou sem gás\nPreço: R$ 3,00");
    public static Produto cha   = new Produto("Chá Gelado", 6.00f, "Chá Gelado - Chá mate\nPreço: R$ 6,00");

    // Bebidas Alcoólicas
    public static Produto cerveja     = new Produto("Cerveja", 8.00f, "Cerveja - Long neck 330ml\nPreço: R$ 8,00");
    public static Produto vinho       = new Produto("Vinho", 12.00f, "Vinho - Taça de vinho tinto seco\nPreço: R$ 12,00");
    public static Produto caipirinha  = new Produto("Caipirinha", 14.00f, "Caipirinha - Limão, açúcar e cachaça\nPreço: R$ 14,00");
    public static Produto whisky      = new Produto("Whisky", 18.00f, "Whisky - Dose simples\nPreço: R$ 18,00");

    
    
    public Produto(String nome, float preco, String desc){
        this.nome=nome;
        this.preco=preco;
        this.desc=desc;
    }
}
