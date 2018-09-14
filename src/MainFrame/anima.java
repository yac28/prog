package MainFrame;

import MainFrame.scheletro;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class anima {

    private final scheletro view;
    private boolean[][] currentGeneration;
    private TimerTask task;
    private int number;

    public anima (final scheletro view, int N) {
        this.number = N;
        this.view = view;
        this.currentGeneration = new boolean[view.getY()][view.getX()];
        final Random random = new Random();
        for (int row = 0; row < currentGeneration.length; ++row) {
            for (int col = 0; col < currentGeneration[row].length; ++col) {
                currentGeneration[row][col] = random.nextBoolean();
            }
        }
    }

    private int contaVicini(final boolean[][] genitore, final int rig, final int col) {
        int numeroVicini = 0;

        // Nord
        if ((rig - 1 >= 0) && (col < genitore[0].length)) {
            if (genitore[rig - 1][col]){
                numeroVicini += 1;
            }
        }

        // Nord Est
        if ((rig - 1 >= 0) && (col + 1 < genitore[0].length)) {
            if(genitore[rig - 1][col + 1]){
                numeroVicini += 1;
            }
        }

        // Est
        if ((rig < genitore.length) && (col + 1 < genitore[0].length)) {
            if (genitore[rig][col + 1]) {
                numeroVicini += 1;
            }
        }

        // Sud Est
        if ((rig + 1 < genitore.length) && (col + 1 < genitore[0].length)) {
            if (genitore[rig + 1][col + 1]) {
                numeroVicini += 1;
            }
        }

        // Sud
        if ((rig + 1 < genitore.length) && (col < genitore[0].length)) {
            if (genitore[rig + 1][col]) {
                numeroVicini += 1;
            }
        }

        // Sud Ovest
        if ((rig + 1 < genitore.length) && (col - 1 >= 0)) {
            if (genitore[rig + 1][col - 1]) {
                numeroVicini += 1;
            }
        }

        // Ovest
        if ((rig >= 0) && (col - 1 >= 0)) {
            if (genitore[rig][col - 1]) {
                numeroVicini += 1;
            }
        }

        // Nord Ovest
        if ((rig - 1 >= 0) && (col - 1 >= 0)) {
            if (genitore[rig - 1][col - 1]) {
                numeroVicini += 1;
            }
        }

        return numeroVicini;
    }

    public void start() {
        task = new TimerTask() {

            public void run() {
                currentGeneration = figli(currentGeneration);
                view.generafigli(currentGeneration,number);
            }
        };
        new Timer().schedule(task, 0, 50);
    }

    private boolean[][] figli(final boolean[][] genitore) {
        final boolean[][] nuovaGenerazione = copiaVecchiaGen(genitore);

        // Parte in cui sei Dio
        for (int rig = 0; rig < genitore.length; ++rig) {

            for (int col = 0; col < genitore[rig].length; ++col) {

                final int numeroVicini = contaVicini(genitore, rig, col);

                // Se troppo o troppo poco popolata, la cellula muore :'(
                if ((numeroVicini < 2) || (numeroVicini > 3)) {
                    nuovaGenerazione[rig][col] = false;
                }

                // Se no, non cambia nulla
                if (numeroVicini == 2) {
                    nuovaGenerazione[rig][col] = genitore[rig][col];
                }

                // 3 == numero perfetto, allora si crea una nuova cellula :D
                if (numeroVicini == 3) {
                    nuovaGenerazione[rig][col] = true;
                }
            }
        }

        return nuovaGenerazione;
    }

    private boolean[][] copiaVecchiaGen(final boolean vecchiaGen[][]) {

        final boolean[][] nuovaGen = new boolean[vecchiaGen.length][];

        for (int rig = 0; rig < vecchiaGen.length; ++rig) {
            nuovaGen[rig] = Arrays.copyOf(vecchiaGen[rig], vecchiaGen[rig].length);
        }
        return nuovaGen;
    }


}