package collections;

public class Programa {
    public static void main(String[] args) {
        LanHouse celha = new LanHouse();
        celha.addNotebook("Aspire 3", "acer", new Teclado(), new Tela());
        celha.addNotebook("Dell Inspiron", "dell", new Teclado(), new Tela());
        celha.addNotebook("Dell Gamer", "dell", new Teclado(), new Tela());
        celha.addNotebook("Asus X", "Asus", new Teclado(), new Tela());


        celha.getNotebook();

        celha.searchNotebook("dell");



    }
}
