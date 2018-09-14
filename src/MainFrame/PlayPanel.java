package MainFrame;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;

public class PlayPanel extends JPanel {
    private MainFrame mainFrame;
    public JLabel bkg=new JLabel(new ImageIcon("finalbkg2.jpg"));
    //private JButton hello=new JButton("hello");
    public PlayPanel(MainFrame g){
        //hello.setBounds(0,0,800,500);
        //hello.setBounds(50,70,699,350);
        //hello.setBounds(50,70,600,325);
        //hello.setBounds(0,0,750,225);
        //hello.setBounds(0,0,650,450);

        this.mainFrame = g;
        this.setLayout(new BorderLayout());
        //this.add(hello);
        this.add(bkg);
    }

    public void Init()
    {
        System.out.println(mainFrame.inputs.get("Grid"));
        GridTemplates T = new GridTemplates(mainFrame.inputs.get("Grid"));
        APP Play = new APP(T.x,T.y,T.Grid,T.BolGrid, mainFrame);
    }
}
