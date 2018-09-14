package MainFrame;

import javax.swing.*;
import java.util.HashMap;

public class MainFrame extends JFrame
{
    //private JMenuBar menuBar = new JMenuBar();
    StartScreen start;
    RandomPanel second;
    GridPanel third;
    AnimalsPanel fourth;
    Rules fifth;
    PlayPanel last;
    HashMap<String, String> inputs = new HashMap<>();


    //MainFrame constructor
    public MainFrame()
    {
        // add a LanguagePanel and pass this as the frame
        start = new StartScreen(this);
        second=new RandomPanel(this);
        third=new GridPanel(this);
        fourth= new AnimalsPanel(this);
        fifth=new Rules(this);
        last=new PlayPanel(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Game of Life");
        this.setResizable(false);
        this.setSize(800,650);
        this.setLocationRelativeTo(null);
        //this.setUndecorated(true);

        //this.setJMenuBar(menuBar);

        this.add(start);

        this.setVisible(true);
    } // end MainFrame constructor

    public static void main(String[] args) {
        new MainFrame();
    }
} // end class MainFrame
