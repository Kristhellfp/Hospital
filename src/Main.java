import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Crear el marco principal
        JFrame miVentana = new JFrame("Iskrisss");
        miVentana.setSize(1800, 1000);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.PINK);
        mainPanel.setLayout(new GridLayout(1, 2));


        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);

        JPanel panel2 = new JPanel();


        mainPanel.add(panel1);
        mainPanel.add(panel2);



        miVentana.add(mainPanel);
        miVentana.setVisible(true);
    }
}
