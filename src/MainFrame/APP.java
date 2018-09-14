package MainFrame;

public class APP {

    public APP(int x, int y, int g[][], boolean bg[][], MainFrame m) {

        final scheletro automa = new corpo (x, y, g, bg,m);
        final anima mondopieno = new anima(automa);
        mondopieno.start();
    }
}