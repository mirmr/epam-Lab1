import javax.swing.*;
import java.awt.*;

public class Lab1 {
    private static void createAndShowGUI() {


        JFrame frame = new JFrame(" ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(" ");
        JLabel speed1 = new JLabel("Скоость");
        JTextField speed1Value = new JTextField();
        Dimension a =new Dimension(100,30);
        speed1Value.setPreferredSize(a);
        JLabel speed2 = new JLabel("Скоость");
        JTextField speed2Value = new JTextField();
        speed2Value.setPreferredSize(a);
        JLabel weight1 = new JLabel("Масса");
        JTextField weight1Value = new JTextField();
        weight1Value.setPreferredSize(a);
        JLabel weight2 = new JLabel("Масса");
        JTextField weight2Value = new JTextField();
        weight2Value.setPreferredSize(a);
        JButton calc = new JButton ("Посчитать");
        JLabel result = new JLabel("Скорость после столкновения: 0");
        calc.addActionListener(e -> {
            double mas1 = Double.parseDouble(weight1Value.getText());
            double mas2 = Double.parseDouble(weight2Value.getText());
            double sp1 = Double.parseDouble(speed1Value.getText());
            double sp2 = Double.parseDouble(speed2Value.getText());
            double res = (mas1 * sp1 + mas2 * sp2) / (mas1 + mas2);
            result.setText("Скорость после столкновения: " + res);

        });


        frame.getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        frame.getContentPane().add(weight1, c);

        c.gridx = 2;
        c.gridy = 0;
        c.weightx = 0.5;
        frame.getContentPane().add(weight2, c);


        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        frame.getContentPane().add(weight1Value, c);


        c.gridx = 3;
        c.gridy = 0;
        c.weightx = 0.5;
        frame.getContentPane().add(weight2Value, c);


        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.5;
        frame.getContentPane().add(speed1, c);

        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 1;
        frame.getContentPane().add(speed1Value, c);

        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 0.5;
        frame.getContentPane().add(speed2, c);

        c.gridx = 3;
        c.gridy = 1;
        c.weightx = 1;
        frame.getContentPane().add(speed2Value, c);

        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 1;
        c.gridwidth = 2;
        frame.getContentPane().add(result, c);

        c.gridx = 3;
        c.gridy = 2;
        c.weightx = 1;
        frame.getContentPane().add(calc, c);



        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}