import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Logger;


public class Dados extends JFrame implements ActionListener{
private JTextField id, nome, endereco, bairro, cidade, cargo;
private JFormattedTextField CPF, telefone, dataAdm, depend, sal;

private JLabel textId, textNome, textEnd, textCPF, textFone, textBairro, textCidade, textCargo, textData, textDepend, textSal;
private MaskFormatter maskCPF, maskFone, maskAdm, maskDepend, maskSal;
private JButton botaoLimpa, botaoEnvia;

public Dados() throws ParseException {

    super("Insira suas Informações");
    setLayout(new GridLayout(0, 2, 10, 10));


    id = new JTextField();
    textId = new JLabel("ID: ");
    add(textId);
    add(id);

    nome = new JTextField();
    textNome = new JLabel("Nome: ");
    add(textNome);
    add(nome);

    maskCPF = new MaskFormatter("###.###.###-##");
    CPF = new JFormattedTextField(maskCPF);
    textCPF = new JLabel("CPF: ");
    add(textCPF);
    add(CPF);

    endereco = new JTextField();
    textEnd = new JLabel("Endereço: ");
    add(textEnd);
    add(endereco);

    bairro = new JTextField();
    textBairro = new JLabel("Bairro: ");
    add(textBairro);
    add(bairro);

    cidade = new JTextField();
    textCidade = new JLabel("Cidade: ");
    add(textCidade);
    add(cidade);

    maskFone = new MaskFormatter("(##)####-####");
    telefone = new JFormattedTextField(maskFone);
    textFone = new JLabel("Fone: ");
    add(textFone);
    add(telefone);

    cargo = new JTextField();
    textCargo = new JLabel("Cargo: ");
    add(textCargo);
    add(cargo);

    maskAdm = new MaskFormatter("##/##/####");
    dataAdm = new JFormattedTextField(maskAdm);
    textData = new JLabel("Data de admissão:");
    add(textData);
    add(dataAdm);

    maskDepend = new MaskFormatter("#");
    depend = new JFormattedTextField(maskDepend);
    textDepend = new JLabel("Número de Dependentes: ");
    add(textDepend);
    add(depend);

    maskSal = new MaskFormatter("R$####,##");
    sal = new JFormattedTextField(maskSal);
    textSal = new JLabel("Salário: ");
    add(textSal);
    add(sal);

    botaoLimpa = new JButton("Sair");
    botaoLimpa.setSize(10,20);
    botaoLimpa.addActionListener(this);
    add(botaoLimpa);

    botaoEnvia = new JButton("Enviar");
    botaoEnvia.setSize(10,20);
    botaoEnvia.addActionListener(this);
    add(botaoEnvia);
}

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            if (obj == botaoLimpa) {
                System.exit(0);
            } else {
                    JOptionPane.showMessageDialog(null, "Dados enviados com sucesso", "Comfirmado", JOptionPane.WARNING_MESSAGE);
            }
        }

    }


