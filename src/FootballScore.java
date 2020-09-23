import javax.swing.*;
import java.awt.*;

class FootballScore extends JFrame {

    JButton bt1 = new JButton("Real Madrid");
    JButton bt2 = new JButton("AC Milan");
    JLabel lb1 = new JLabel("Result: 0 X 0 ");
    JLabel lb2 = new JLabel("Last Scorer: N/A");
    Label lb3 = new Label("Winner: DRAW");
    int RealMadrid = 0;
    int AC_Milan = 0;

    FootballScore() {
        super("Football Score");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new FlowLayout());
        setSize(400, 300);
        setVisible(true);

        add(bt1);
        add(bt2);
        add(lb1);
        add(lb2);
        add(lb3);

        bt1.addActionListener(e ->
        {
            RealMadrid++;
            lb2.setText("Last Scorer: Real Madrid");
            lb1.setText("Result " + RealMadrid + " X " + AC_Milan);
            if (AC_Milan > RealMadrid) {
                lb3.setText("Winner: AC Milan");
            } else if (AC_Milan == RealMadrid) {
                lb3.setText("DRAW");
            } else
                lb3.setText("Winner: Real Madrid");
        });

        bt2.addActionListener(e ->
        {
            AC_Milan++;
            lb2.setText("Last Scorer: AC Milan");
            lb1.setText("Result " + RealMadrid + " X " + AC_Milan);
            if (AC_Milan > RealMadrid) {
                lb3.setText("Winner: AC Milan");
            } else if (AC_Milan == RealMadrid) {
                lb3.setText("DRAW");
            } else
                lb3.setText("Winner: Real Madrid");
        });
    }

    public static void main(String[] args) {
        new FootballScore();
    }
}

