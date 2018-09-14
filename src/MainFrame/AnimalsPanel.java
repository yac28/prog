package MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class AnimalsPanel extends JPanel  {
    private JButton next_button = new JButton(new ImageIcon(new ImageIcon("future.png").getImage().getScaledInstance(110, 73, Image.SCALE_DEFAULT)));
    private JButton prev_button = new JButton(new ImageIcon(new ImageIcon("past.png").getImage().getScaledInstance(110, 73, Image.SCALE_DEFAULT)));
    private JButton lions = new ButtonsG(new ImageIcon("lions.png"));
    private JButton zebras = new ButtonsG(new ImageIcon("zebras.png"));
    private JButton eagles = new ButtonsG(new ImageIcon("eagles.png"));
    private JButton wolves = new ButtonsG(new ImageIcon("wolves.png"));
    private JButton sheep = new ButtonsG(new ImageIcon("sheep.png"));
    private JTextField t1=new TxtBox(10);
    private JTextField t2=new TxtBox(10);
    private JTextField t3=new TxtBox(10);
    private JTextField t4=new TxtBox(10);
    private JTextField t5=new TxtBox(10);
    private int sum=0;
    private boolean control=true;

    public JLabel bkg=new JLabel(new ImageIcon("animals.png"));
    private MainFrame mainFrame;

    public AnimalsPanel(MainFrame g){
        this.mainFrame = g;
        this.setLayout(new BorderLayout());

        eagles.setLocation(170,100);
        eagles.setName("eagles");
        wolves.setLocation(170,180);
        wolves.setName("wolves");
        sheep.setLocation(170,260);
        sheep.setName("sheep");
        lions.setLocation(170,340);
        lions.setName("lions");
        zebras.setLocation(170,420);
        zebras.setName("zebras");


        t1.setLocation(500,100);
        PlainDocument doc1 = (PlainDocument) t1.getDocument();
        doc1.setDocumentFilter(new textField());

        //titleText.setPreferredSize( new Dimension( 200, 24 ) );

        t2.setLocation(500,180);
        PlainDocument doc2 = (PlainDocument) t2.getDocument();
        doc2.setDocumentFilter(new textField());

        t3.setLocation(500,260);
        PlainDocument doc3 = (PlainDocument) t2.getDocument();
        doc3.setDocumentFilter(new textField());

        t4.setLocation(500,340);
        PlainDocument doc4 = (PlainDocument) t2.getDocument();
        doc4.setDocumentFilter(new textField());

        t5.setLocation(500,420);
        PlainDocument doc5 = (PlainDocument) t2.getDocument();
        doc5.setDocumentFilter(new textField());


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
        eagles.addActionListener(new AnimalListener());
        wolves.addActionListener(new AnimalListener());
        lions.addActionListener(new AnimalListener());
        sheep.addActionListener(new AnimalListener());
        zebras.addActionListener(new AnimalListener());
        this.add(prev_button);
        this.add(next_button);
        this.add(lions);
        this.add(eagles);
        this.add(wolves);
        this.add(sheep);
        this.add(zebras);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
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
                if (!control){
                    System.out.println("error");
                }
                else{
                    mainFrame.inputs.put("Eagles",t1.getText());
                    mainFrame.inputs.put("Wolves",t2.getText());
                    mainFrame.inputs.put("Sheep",t3.getText());
                    mainFrame.inputs.put("Lions",t4.getText());
                    mainFrame.inputs.put("Zebras",t5.getText());
            mainFrame.remove(mainFrame.fourth);
            mainFrame.getContentPane().add(mainFrame.fifth);
            mainFrame.repaint();
            mainFrame.revalidate();}
        }

        else{
                mainFrame.remove(mainFrame.fourth);
                mainFrame.getContentPane().add(mainFrame.third);
                mainFrame.repaint();
                mainFrame.revalidate();
            }}

    }
    class AnimalListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        { Object eventSource = e.getSource();
            if(eventSource.equals(eagles)){
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setTitle("Eagles");
                f.setSize(150,70);
                f.setResizable(false);
                JPanel error_message=new JPanel(new BorderLayout());
                JLabel warn=new JLabel(new ImageIcon("eagles_info.png"));
                error_message.add(warn);
                f.getContentPane().add(error_message);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
            else if(eventSource.equals(wolves)) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setTitle("Wolves");
                f.setSize(150,70);
                f.setResizable(false);
                JPanel error_message=new JPanel(new BorderLayout());
                JLabel warn=new JLabel(new ImageIcon("wolves_info.png"));
                error_message.add(warn);
                f.getContentPane().add(error_message);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
            else if(eventSource.equals(lions)) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setTitle("Lions");
                f.setSize(150,70);
                f.setResizable(false);
                JPanel error_message=new JPanel(new BorderLayout());
                JLabel warn=new JLabel(new ImageIcon("lions_info.png"));
                error_message.add(warn);
                f.getContentPane().add(error_message);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
            else if(eventSource.equals(zebras)) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setTitle("Zebras");
                f.setSize(150,70);
                f.setResizable(false);
                JPanel error_message=new JPanel(new BorderLayout());
                JLabel warn=new JLabel(new ImageIcon("zebras_info.png"));
                error_message.add(warn);
                f.getContentPane().add(error_message);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }

            else{
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setTitle("Sheep");
                f.setSize(150,70);
                f.setResizable(false);
                JPanel error_message=new JPanel(new BorderLayout());
                JLabel warn=new JLabel(new ImageIcon("sheep_info.png"));
                error_message.add(warn);
                f.getContentPane().add(error_message);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
            }}
    class textField extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string,
                                 AttributeSet attr) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.insert(offset, string);

            if (isInt(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            }
        }

        private boolean isInt(String text) {
            try {
                Integer.parseInt(text);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text,
                            AttributeSet attrs) throws BadLocationException {

            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));

            if (!sb.toString().isEmpty()){
                sum=sum-Integer.parseInt(sb.toString());
            }
            sb.replace(offset, offset + length, text);
            sum+=Integer.parseInt(sb.toString());
            System.out.println("sum:"+sum);
            if (sum>1000000){
                System.out.println("Max Number of Inhabitants for the chosen grid is 1000000");
                control=false;
            }

            if (isInt(sb.toString())) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length)
                throws BadLocationException {
            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            System.out.println(Integer.parseInt(sb.toString()));
            sum=sum-Integer.parseInt(sb.toString());
            sb.delete(offset, offset + length);


            super.remove(fb, offset, length);
            if (isInt(sb.toString())) {
            sum+=Integer.parseInt(sb.toString());
            if (sum<=1000){control=true;}
            }
            //System.out.println("sum:"+sum);
        /*} else {
            // warn the user and don't allow the insert
            System.out.println("hj");
        }*/

        }
    }}
