package main;

import javax.swing.JTextField;

public class Logic {

    private int kek;
    private int episode;
    private int phase;

    private Ratings ratings;
    private Colour color;

    public Logic() {

        kek = -1;
        episode = 0;
        phase = 1;

        ratings = new Ratings();
        color = new Colour();
    }

    public void processKek(JTextField field1, JTextField field2, JTextField field3) {

        if (phase == 3) {
            return;
        }

        if (phase == 2) {
            phaseTwo(field1, field2, field3);
            return;
        }

        if (phase == 1) {
            phaseOne(field1, field2, field3);
        }
    }

    private void phaseOne(JTextField field1, JTextField field2, JTextField field3) {

        try {
            kek = Integer.parseInt(field2.getText().trim());
        } catch (Exception e) {
            //nothing
        }
        if (kek > 0 && kek <= 10) {
            phase = 2;
            phaseTwo(field1, field2, field3);
        } else {
            field2.setText("");
            field3.setText("Jaksojen määrän on oltava välillä 1-10.");
        }
    }

    private void phaseTwo(JTextField field1, JTextField field2, JTextField field3) {

        if (episode != 0 && !field2.getText().trim().equals("10")) {
            field2.setText("");
            field3.setText("Arvostele jakso asteikolla 10 (loistava) - 10 (loistava).");
            return;
        }

        if (episode >= kek) {
            phase = 3;
            phaseThree(field1, field2, field3);
            return;
        }

        if (episode != 0) {
            ratings.addRating(Integer.parseInt(field2.getText().trim()));
        }

        field1.setForeground(color.getColor());

        episode++;

        field1.setText("Anna arvosana jaksolle " + episode + ":");
        field2.setText("");
        field3.setText("");

    }

    private void phaseThree(JTextField field1, JTextField field2, JTextField field3) {

        ratings.addRating(Integer.parseInt(field2.getText().trim()));

        field1.setText("");
        field3.setText("");
        field1.setVisible(false);
        field3.setVisible(false);
        field2.setEditable(false);
        field2.setText("Keskiarvo: " + ratings.average());
    }

}
