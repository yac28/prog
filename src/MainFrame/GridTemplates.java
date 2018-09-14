package MainFrame;

public class GridTemplates {
    public int x;
    public int y;

    public int Grid [][];
    public boolean BolGrid [][];

    public GridTemplates(String type)
    {
        switch (type)
        {
            case "small_rect":
                x = 500;
                y = 250;
                Grid = new int[250][500];
                BolGrid = new boolean[250][500];

                for (int j = 0;j<250;j++)
                {
                    for (int i= 0 ;i<500;i++)
                    {
                        Grid[j][i] = 1;
                        BolGrid[j][i] = false;
                    }
                }

            case "big_rect":
                x = 1000;
                y = 500;
                Grid = new int[500][1000];
                BolGrid = new boolean[500][1000];

                for (int j = 0;j<500;j++)
                {
                    for (int i= 0 ;i<1000;i++)
                    {
                        Grid[j][i] = 1;
                        BolGrid[j][i] = false;
                    }
                }

            case "triangle":
                Grid = new int[398][795];
                BolGrid = new boolean[398][795];

                for (int j = 0;j<398;j++)
                {
                    int Start = (795/2)-j;
                    int End = 795-(Start*2);
                    for (int i= Start+1 ;i<End;i++)
                    {
                        Grid[j][i] = 1;
                        BolGrid[j][i] = false;
                    }
                }

            /*case "crab":
                Grid = new int[325][120];
                BolGrid = new boolean[325][120];

                for (int j = 0;j<325;j++)
                {
                    int Start = 0;
                    int End = 0;

                    if(j>=0 && j<=70)
                    {
                        Start = 40;
                        End = 80;
                    }
                    if(j>=71 && j<=96)
                    {

                    }
                    if(j>=20 && j<=24)
                    {

                    }
                    if(j>=25 && j<=39)
                    {

                    }
                    if(j>=40 && j<=54)
                    {

                    }
                    if(j>=55 && j<=59)
                    {

                    }
                    if(j>=60 && j<=64)
                    {

                    }

                    for (int i= Start+1 ;i<End;i++)
                    {
                        Grid[j][i] = 1;
                        BolGrid[j][i] = false;
                    }
                }*/

        }

    }


}
