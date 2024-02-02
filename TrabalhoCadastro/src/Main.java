import javax.swing.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Dados dados = new Dados();
        dados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dados.pack();
        dados.setVisible(true);
        dados.setLocationRelativeTo(null);
    }
}