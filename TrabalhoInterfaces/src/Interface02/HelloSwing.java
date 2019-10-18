package Interface02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HelloSwing extends JFrame {

	public HelloSwing() {
		setTitle("fernando");
		
		setSize(450,250);
		
		setLocation(1336/2-450/2,768/2-250/2);
		
		setResizable(false);
		
		setLayout();
		
    }
	private void setLayout() {

		JPanel panel = new JPanel();
		// Retira o gerenciador de Layout
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com Titulo
				,BorderFactory.createTitledBorder("Login")));
		
		
		//Campo texto com X caracteres
				JTextField text1 = new JTextField(200);
				text1.setBounds(125, 60, 250, 30);
				
				JPasswordField text2 = new JPasswordField(200);
				text2.setBounds(125, 100, 250, 30);
				
				JLabel labelu = new JLabel("Usuário: ");
				// Cor do texto
				labelu.setForeground(Color.BLACK);
				labelu.setBounds(60, 60, 80, 30);
				
				JLabel labels = new JLabel("Senha: ");
				// Cor do texto
				labels.setForeground(Color.BLACK);
				labels.setBounds(60, 100, 80, 30);
				
				JLabel labelems = new JLabel("Esqueci minha senha");
				// Cor do texto
				labelems.setForeground(Color.decode("#FF00FF"));
				labelems.setBounds(125, 208, 160, 30);
				
				JButton button = new JButton("Acessar!!");
				button.setBounds(125, 145, 250, 25);
				/*
				 * button.addActionListener(new ActionListener() {
				 * 
				 * @Override public void actionPerformed(ActionEvent e) { String textou =
				 * text1.getText(); labelu.setText(textou);
				 * 
				 * String textos = text2.getText(); labels.setText(textos); }
				 * 
				 * // JOptionPane.showMessageDialog(null, "Olá!"); //}
				 * 
				 * });
				 */
				
				JCheckBox check = new JCheckBox("Me selecione!");
				check.setText("Manter Acessado");
				check.setBounds(122, 175, 160, 30);
				
								
				panel.add(text1);
				panel.add(text2);
				panel.add(button);
				// Adiciona o painel no frame
				panel.add(labelu);
				panel.add(labels);
				panel.add(check);
				panel.add(labelems);
				
				// Adiciona o painel no frame
				add(panel);
			}

		}
