package MainFrame;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;

public class TxtBox extends JTextField{
    int columns;
    public TxtBox(int columns){
        this.columns=columns;
        this.setColumns(columns);
        this.setSize(150,50);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setHorizontalAlignment(JTextField.CENTER);
        Font font = new Font("Calibri", Font.ITALIC,24);
        this.setFont(font);
    }}

        //JTextField textField = new JTextField(4);

        //JPanel panel = new JPanel();
        //panel.add(textField);

        /*PlainDocument doc = (PlainDocument) textField.getDocument();
        doc.setDocumentFilter(new MyIntFilter());*/


        //JOptionPane.showMessageDialog(null, panel);


/*
class MyIntFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string,
                             AttributeSet attr) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);

        if (test(sb.toString())) {
            super.insertString(fb, offset, string, attr);
        } else {
            // warn the user and don't allow the insert
        }
    }

    private boolean test(String text) {
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
        sb.replace(offset, offset + length, text);

        if (test(sb.toString())) {
            super.replace(fb, offset, length, text, attrs);
        } else {
            // warn the user and don't allow the insert
            System.out.println("UI");
        }

    }

    @Override
    public void remove(FilterBypass fb, int offset, int length)
            throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.delete(offset, offset + length);

        //if (test(sb.toString())) {
        super.remove(fb, offset, length);
        /*} else {
            // warn the user and don't allow the insert
            System.out.println("hj");
        }*/


