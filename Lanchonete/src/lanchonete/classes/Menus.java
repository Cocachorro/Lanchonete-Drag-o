package lanchonete.classes;

public class Menus {

    public static void bemVindo() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                          ║");
        System.out.println("║         ★ Bem-vindo(a) à Lanchonete Dragão ★             ║");
        System.out.println("║                                                          ║");
        System.out.println("║       Escolha seu prato interagindo com o menu           ║");
        System.out.println("║                  Utilize o teclado!                      ║");
        System.out.println("║                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    public static void menu() {
        System.out.println("\n\nCardápio: \n");
        System.out.println("1 - Sanduíches");
        System.out.println("2 - Pastéis");
        System.out.println("3 - Sorvetes");
        System.out.println("4 - Bebidas não alcoólicas");
        System.out.println("5 - Bebidas alcoólicas");
        System.out.println("6 - Carrinho");
        System.out.println("0 - Sair");
        System.out.print("Digite o número do menu desejado e pressione Enter: ");
    }

    public static void sanduiches() {
        System.out.println("\n\nSanduíches Disponíveis:");
        System.out.println("1 - X-Burguer");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Bacon");
        System.out.println("4 - X-Egg");
        msgFinal();
    }

    public static void pasteis() {
        System.out.println("\n\nPastéis Disponíveis:");
        System.out.println("1 - Pastel de Carne");
        System.out.println("2 - Pastel de Queijo");
        System.out.println("3 - Pastel de Pizza");
        System.out.println("4 - Pastel de Chocolate");
        msgFinal();
    }

    public static void sorvetes() {
        System.out.println("\n\nSorvetes Disponíveis:");
        System.out.println("1 - Sorvete de Baunilha");
        System.out.println("2 - Sorvete de Chocolate");
        System.out.println("3 - Sorvete de Morango");
        System.out.println("4 - Sundae Especial");
        msgFinal();
    }

    public static void bebidasNaoAlcoolicas() {
        System.out.println("\n\nBebidas Não Alcoólicas:");
        System.out.println("1 - Refrigerante");
        System.out.println("2 - Suco Natural");
        System.out.println("3 - Água Mineral");
        System.out.println("4 - Chá Gelado");
        msgFinal();
    }

    public static void bebidasAlcoolicas() {
        System.out.println("\n\nBebidas Alcoólicas:");
        System.out.println("1 - Cerveja");
        System.out.println("2 - Vinho");
        System.out.println("3 - Caipirinha");
        System.out.println("4 - Whisky");
        msgFinal();
    }

    public static void carrinhoMenu() {
        System.out.println("\n\nNo seu carrinho atualmente tem:");
        for (String produto : Carrinho.carrinho) {
            System.out.println("-" + produto);
        }
        System.out.println();
        System.out.println(Carrinho.total);
        System.out.println("\nQual será a forma de pagamento?\n1- Crédito a vista\n2- Débito\n3- Pix");
    }

    public static void carrinhoFinal() {
        System.out.println("Pagamento autorizado!\nObrigado pela preferência.");
    }

    public static void despedida() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                          ║");
        System.out.println("║      Obrigado por visitar a Lanchonete Dragão!           ║");
        System.out.println("║                                                          ║");
        System.out.println("║      Esperamos vê-lo(a) novamente em breve!              ║");
        System.out.println("║                                                          ║");
        System.out.println("║                Tenha um ótimo dia!                       ║");
        System.out.println("║                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    public static void msgFinal() {
        System.out.println("5 - Voltar");
        System.out.println("→ Escolha um item para ver mais informações.");
    }

    public static void qrCodeSimulado() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                          ║");
        System.out.println("║                 ESCANEIE O QR CODE                       ║");
        System.out.println("║                                                          ║");
        System.out.println("║              █ █ ▓ ▓ █ █ ▓ ▓ █ ▓ ▓ █ ▓                   ║");
        System.out.println("║              ▓ ▓ █ █ ▓ █ ▓ ▓ █ ▓ █ ▓ ▓                   ║");
        System.out.println("║              █ ▓ ▓ █ ▓ ▓ █ █ ▓ ▓ █ ▓ ▓                   ║");
        System.out.println("║              ▓ ▓ ▓ ▓ █ ▓ ▓ ▓ ▓ █ █ █ ▓                   ║");
        System.out.println("║              █ ▓ █ ▓ ▓ █ ▓ ▓ ▓ █ ▓ █ ▓                   ║");
        System.out.println("║                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
