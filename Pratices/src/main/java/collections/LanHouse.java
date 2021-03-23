package collections;

import java.util.ArrayList;
import java.util.List;

public class LanHouse {
    private final List<Notebook> notebooks;

    public LanHouse() {
        notebooks = new ArrayList<>();
    }

    public void addNotebook(String nome, String marca, Teclado teclado, Tela tela) {
        Notebook notebook = new Notebook(nome, marca, teclado, tela);

        notebooks.add(notebook);
    }

    public void getNotebook() {
        for (Notebook nots : notebooks) {
            System.out.println(nots.toString());
        }
    }

    public void searchNotebook(String marca) {

        for (Notebook nots : notebooks) {
            if (nots.getMarca().equals(marca)) {

                System.out.printf("Notebooks da marca %s: %s \n", marca, nots);

            }
        }
    }


}
