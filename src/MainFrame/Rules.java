package MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JPanel  {
    private JButton next_button = new JButton(new ImageIcon(new ImageIcon("future.png").getImage().getScaledInstance(110, 73, Image.SCALE_DEFAULT)));
    private JButton prev_button = new JButton(new ImageIcon(new ImageIcon("past.png").getImage().getScaledInstance(110, 73, Image.SCALE_DEFAULT)));
    public JLabel bkg=new JLabel(new ImageIcon("finalbkg2.jpg"));
    private MainFrame mainFrame;
    // implements ActionListener
    public Rules(MainFrame g){
        this.mainFrame = g;
        this.setLayout(new BorderLayout());
        next_button.setOpaque(false);
        next_button.setContentAreaFilled(false);
        next_button.setBorderPainted(false);
        next_button.setSize(180,100);
        next_button.setLocation(600,480);

        prev_button.setOpaque(false);
        prev_button.setContentAreaFilled(false);
        prev_button.setBorderPainted(false);
        prev_button.setSize(180,100);
        prev_button.setLocation(10,480);
        next_button.addActionListener(new ButtonListener());
        prev_button.addActionListener(new ButtonListener());
        this.add(prev_button);
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
            if(eventSource.equals(next_button)){
                mainFrame.remove(mainFrame.fifth);
                mainFrame.last.Init();
                mainFrame.getContentPane().add(mainFrame.last);
                mainFrame.repaint();
                mainFrame.revalidate();
            }
            else{
                mainFrame.remove(mainFrame.fifth);
                mainFrame.getContentPane().add(mainFrame.fourth);
                mainFrame.repaint();
                mainFrame.revalidate();
            }}

    }}