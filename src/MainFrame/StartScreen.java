package MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JPanel
{
    private JButton play_button = new JButton(new ImageIcon("play.png"));
    public JLabel start=new JLabel(new ImageIcon("startscreen.png"));
    private MainFrame mainFrame;

    public StartScreen(MainFrame frame)
    {
        this.mainFrame = frame;
        this.setLayout(new BorderLayout());
        play_button.setSize(180,45);
        play_button.setLocation(300,480);
        play_button.addActionListener(new ButtonListener());
        this.add(play_button);
        this.add(start);
        //this.add(background);
    }

    class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            mainFrame.remove(mainFrame.start);
            mainFrame.getContentPane().add(mainFrame.second);
            mainFrame.repaint();
            mainFrame.revalidate();
        }

    }
}
