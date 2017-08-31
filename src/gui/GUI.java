package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        this.frame = new JFrame("GoT-arvosanalaskuri");
        frame.setPreferredSize(new Dimension(350, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        components(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void components(Container container) {

        GridLayout layout = new GridLayout(3, 0);
        container.setLayout(layout);

        JTextField field1 = new JTextField("Esitettyjen jaksojen määrä (1-10):");
        JTextField field2 = new JTextField("");
        JTextField field3 = new JTextField("");

        field1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        field1.setHorizontalAlignment(JTextField.CENTER);
        field1.setEditable(false);

        field2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        field2.setHorizontalAlignment(JTextField.CENTER);

        field1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        field3.setHorizontalAlignment(JTextField.CENTER);
        field3.setEditable(false);
        field3.setForeground(Color.RED);

        container.add(field1);
        container.add(field2);
        container.add(field3);

        addActionListeners(field1, field2, field3);
    }

    private void addActionListeners(JTextField field1, JTextField field2, JTextField field3) {

        AL al = new AL(field1, field2, field3);

        field1.addActionListener(al);
        field2.addActionListener(al);
        field3.addActionListener(al);
    }

}
