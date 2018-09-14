package MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomPanel extends JPanel{
    private JButton next_button = new JButton("next");
    public JLabel bkg=new JLabel(new ImageIcon("randomscreen.png"));
    private MainFrame mainFrame;
    // implements ActionListener
    public RandomPanel(MainFrame g){
        this.mainFrame = g;
        this.setLayout(new BorderLayout());

        next_button.setSize(180,100);
        next_button.setLocation(600,480);


        next_button.addActionListener(new ButtonListener());

        this.add(next_button);
        this.add(bkg);
        //setPreferredSize(new Dimension(800, 650));

        //setVisible(true);


    }
    class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        { Object eventSource = e.getSource();
                mainFrame.remove(mainFrame.second);
                mainFrame.getContentPane().add(mainFrame.third);
                mainFrame.repaint();
                mainFrame.revalidate();
            }}

    }

