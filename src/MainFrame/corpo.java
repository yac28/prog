package MainFrame;

public class corpo implements scheletro {

    private final int x;
    private final int y;
    private final int grid[][];
    private final boolean bolgrid[][];


    public corpo (final int x, final int y, final int g[][], final boolean bg[][],MainFrame m) {

        this.x = x;
        this.y = y;
        this.grid = g;
        this.bolgrid = bg;


        StdDraw.setCanvasSize(x, y,m);
        System.out.println("pronto");
        StdDraw.setYscale(0, y);
        StdDraw.setXscale(0, x);
        StdDraw.setPenRadius(0);
        //StdDraw.setPenColor(StdDraw.BLACK);
    }

    //altezza mondo
    public int getY() {
        return y;
    }

    //larghezza mondo
    public int getX() {
        return x;
    }

    public void generafigli(final boolean[][] figlio) {
        StdDraw.show(0);
        StdDraw.clear();
        for (int row = 0; row < figlio.length; row++) {
            for (int col = 0; col < figlio[row].length; col++) {
                if (figlio[row][col] == true) {
                    StdDraw.point(col, row); //
                }
            }
        }
    }

}