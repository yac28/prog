package MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridPanel extends JPanel  {

    private JButton thread = new ButtonsG(new ImageIcon("thread.png"));
    private JButton earth = new ButtonsG(new ImageIcon("earth.png"));
    private JButton small_rect = new ButtonsG(new ImageIcon("small_rect.png"));
    private JButton big_rect = new ButtonsG(new ImageIcon("big_rect.png"));
    private JButton triangle = new ButtonsG(new ImageIcon("triangle.png"));
    private JButton rhino = new ButtonsG(new ImageIcon("rhino.png"));
    private JButton dog = new ButtonsG(new ImageIcon("dog.png"));
    private JButton butterfly = new ButtonsG(new ImageIcon("butterfly.png"));
    private JButton turtle = new ButtonsG(new ImageIcon("turtle.png"));
    private JButton crab = new ButtonsG(new ImageIcon("crab.png"));

    private JButton next_button = new JButton(new ImageIcon(new ImageIcon("future.png").getImage().getScaledInstance(110, 73, Image.SCALE_DEFAULT)));
    private JButton prev_button = new JButton(new ImageIcon(new ImageIcon("past.png").getImage().getScaledInstance(110, 73, Image.SCALE_DEFAULT)));
    public JLabel bkg=new JLabel(new ImageIcon("gridpanel.png"));
    private MainFrame mainFrame;


    public GridPanel(MainFrame g){
        this.mainFrame = g;
        this.setLayout(new BorderLayout());

        small_rect.setLocation(140,100);
        small_rect.setName("small_rect");
        big_rect.setLocation(140,180);
        big_rect.setName("big_rect");
        triangle.setLocation(140,260);
        triangle.setName("triangle");
        thread.setLocation(140,340);
        thread.setName("thread");
        rhino.setLocation(140,420);
        rhino.setName("rhino");


        earth.setLocation(440,100);
        earth.setName("earth");
        dog.setLocation(440,180);
        dog.setName("dog");
        turtle.setLocation(440,260);
        turtle.setName("turtle");
        butterfly.setLocation(440,340);
        butterfly.setName("butterfly");
        crab.setLocation(440,420);
        crab.setName("crab");


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

        small_rect.addActionListener(new GridListener());
        big_rect.addActionListener(new GridListener());
        triangle.addActionListener(new GridListener());
        rhino.addActionListener(new GridListener());
        thread.addActionListener(new GridListener());
        dog.addActionListener(new GridListener());
        butterfly.addActionListener(new GridListener());
        turtle.addActionListener(new GridListener());
        earth.addActionListener(new GridListener());
        crab.addActionListener(new GridListener());

        next_button.addActionListener(new ButtonListener());
        prev_button.addActionListener(new ButtonListener());
        this.add(thread);
        this.add(small_rect);
        this.add(big_rect);
        this.add(triangle);
        this.add(rhino);
        this.add(earth);
        this.add(dog);
        this.add(butterfly);
        this.add(turtle);
        this.add(crab);

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
                if (mainFrame.inputs.containsKey("Grid")==false){
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setTitle("Select Grid");
                    f.setSize(150,70);
                    f.setResizable(false);
                    JPanel error_message=new JPanel(new BorderLayout());
                    JLabel warn=new JLabel(new ImageIcon("warning.jpeg"));
                    error_message.add(warn);
                    f.getContentPane().add(error_message);
                    f.pack();
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);}
                else{
                mainFrame.remove(mainFrame.third);
                mainFrame.getContentPane().add(mainFrame.fourth);
                mainFrame.repaint();
                mainFrame.revalidate();}
            }
            else{
                mainFrame.remove(mainFrame.third);
                mainFrame.getContentPane().add(mainFrame.second);
                mainFrame.repaint();
                mainFrame.revalidate();
            }}

    }

    JButton old;
    JButton selected;
    ImageIcon old_img;
    class GridListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        { Object eventSource = e.getSource();
            if (mainFrame.inputs.containsKey("Grid")==true){
                old.setIcon(old_img);}
            if(eventSource.equals(thread)){
                selected=thread;
                old_img=new ImageIcon("thread.png");}

            else if(eventSource.equals(small_rect)){
                selected=small_rect;
                old_img=new ImageIcon("small_rect.png");}

            else if(eventSource.equals(big_rect)){
                selected=big_rect;
                old_img=new ImageIcon("big_rect.png");}

            else if(eventSource.equals(triangle)){
                selected=triangle;
                old_img=new ImageIcon("triangle.png");}

            else if(eventSource.equals(rhino)){
                selected=rhino;
                old_img=new ImageIcon("rhino.png");}

            else if(eventSource.equals(dog)){
                selected=dog;
                old_img=new ImageIcon("dog.png");}


            else if(eventSource.equals(butterfly)){
                selected=butterfly;
                old_img=new ImageIcon("butterfly.png");}


            else if(eventSource.equals(turtle)){
                selected=turtle;
                old_img=new ImageIcon("turtle.png");}

            else if(eventSource.equals(earth)){
                selected=earth;
                old_img=new ImageIcon("earth.png");}

            else{selected=crab;
                old_img=new ImageIcon("crab.png");}


            selected.setIcon(new ImageIcon(selected.getName().toString()+"_sel.png"));
            System.out.println(selected.getName().toString());
            mainFrame.inputs.put("Grid",selected.getName().toString());
            old=selected;}}

    }