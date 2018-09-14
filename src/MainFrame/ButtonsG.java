package MainFrame;

import javax.swing.*;

public class ButtonsG extends JButton{
    ImageIcon img;
    public ButtonsG(ImageIcon img){
        this.img=img;
        this.setSize(200,50);
//
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setIcon(img);

    }
}
