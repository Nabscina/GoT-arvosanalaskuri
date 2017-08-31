package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import main.Logic;

public class AL implements ActionListener {

    private Logic logic;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;

    AL(JTextField field1, JTextField field2, JTextField field3) {

        this.logic = new Logic();

        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        logic.processKek(field1, field2, field3);
    }
}
