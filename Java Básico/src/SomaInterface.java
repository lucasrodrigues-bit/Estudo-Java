import javax.swing.*;
import java.awt.*;

public class SomaInterface {
    public static void main(String[] args) {

        // janela principal
        JFrame janela = new JFrame("Calculadora");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        // campos de texto para os números
        JTextField numero1 = new JTextField(10);
        JTextField numero2 = new JTextField(10);

        // botão de somar
        JButton botaoSomar = new JButton("Somar");

        // label para mostrar o resultado
        JLabel resultado = new JLabel("Resultado: ");

        // ação do botão
        botaoSomar.addActionListener(e -> {
            double n1 = Double.parseDouble(numero1.getText());
            double n2 = Double.parseDouble(numero2.getText());
            double res = n1 + n2;
            resultado.setText("Resultado: " + res);
        });

        // adicionando os componentes na janela
        janela.add(new JLabel("Número 1:"));
        janela.add(numero1);
        janela.add(new JLabel("Número 2:"));
        janela.add(numero2);
        janela.add(botaoSomar);
        janela.add(resultado);

        janela.setVisible(true); // exibe a janela
    }
}