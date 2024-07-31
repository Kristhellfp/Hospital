import javax.swing.*;
import java.awt.*;

public class login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Iskrisssss");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(1, 2));


        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.PINK);


        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridBagLayout());
        rightPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel userLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        rightPanel.add(userLabel, gbc);

        JTextField userText = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        rightPanel.add(userText, gbc);

        JLabel passLabel = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        rightPanel.add(passLabel, gbc);

        JPasswordField passText = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        rightPanel.add(passText, gbc);

        JButton loginButton = new JButton("Ingresar");
        gbc.gridx = 1;
        gbc.gridy = 2;
        rightPanel.add(loginButton, gbc);

        frame.add(leftPanel);
        frame.add(rightPanel);

        frame.setVisible(true);
    }
}