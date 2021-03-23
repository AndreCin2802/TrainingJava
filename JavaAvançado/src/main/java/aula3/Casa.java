package aula3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

interface Atividade {
    void realizar();
}

class FutureExemplo {
    private static final ExecutorService pessoasParaExecutarAtividades =
            Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        Casa casa = new Casa(new Quarto());

        var collect = casa.obterAFazeresDaCasa().stream()
                .map(atividade -> pessoasParaExecutarAtividades.submit(atividade::realizar))
                .collect(Collectors.toList());
        pessoasParaExecutarAtividades.shutdown();

        while(!collect.stream().allMatch(Future::isDone)) {
            collect.forEach(Futuro -> {
                if(Futuro.isDone()) {
                    try {
                        System.out.println("Parabens você terminou de "+ Futuro.get());
                    }
                    catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            });
        }


    }
}

class Casa {
    private final List<Comodo> comodos;

    Casa(Quarto comodos) {
        this.comodos = Arrays.asList(comodos);
    }


    List<Atividade> obterAFazeresDaCasa() {
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }

}

abstract class Comodo {
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {

    @Override
    List<Atividade> obterAfazeresDoComodo() {
//        ArrayList<Atividade> objects = new ArrayList<>();
//
//        objects.add(this::arrumarGuardaRoupa);
//        objects.add(this::varrerOQuarto);
//        objects.add(this::getArrumarACama);

        //Método de baixo igual o de cima (syntax sugar)
        return Arrays.asList(this::arrumarGuardaRoupa, this::varrerOQuarto, this::getArrumarACama);
    }


    private void arrumarGuardaRoupa() {
        System.out.println("arrumar o guarda roupa");
    }

    private void varrerOQuarto() {
        System.out.println("arrumar o quarto");
    }

    private void getArrumarACama() {
        System.out.println("arrumar a cama");
    }

}

