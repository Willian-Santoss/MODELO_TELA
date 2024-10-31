package TELA;

import javax.swing.*;
import java.awt.*;

public class ModeloTela {  //Classe principal 
	public static void main(String[] args) { //método main para apresentar ler os resultados e apresentar para o usuario
		
		JFrame frame = new JFrame("AWT Test"); //método que define o nome da tela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cria o botão para fechar a tela
		frame.setSize(400, 200); // define largura e altura da tela
		frame.setLayout(new BorderLayout()); //define o layout da tela
		
		JLabel label1 = new JLabel("Label1"); //método que cria a primeira label
		JTextField textField1 = new JTextField(15); //essa label pode ter até 15 caracteres
		
		JPanel topPanel = new JPanel(); //instância o objeto para criar e apresentar a label1 e o texto na tela
		topPanel.setLayout(new FlowLayout()); //alinha label1 e texto
		topPanel.add(label1); //adiciona a o objeto label1 na tela
		topPanel.add(textField1); //adiciona o espaço para o usuário digitar a informação
		
		// Cria 03 botões onde cada botão é definido por botão 1, 2 e 3
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");

		JPanel bottomPanel = new JPanel(); //instância o objeto para criar e apresentar os botões na tela
		bottomPanel.setLayout(new FlowLayout()); //alinha os botões
		bottomPanel.add(button1); //cria o espaço do botão 1
		bottomPanel.add(button2); //cria o espaço do botão 2
		bottomPanel.add(button3); //cria o espaço do botão 3
		
		frame.add(topPanel, BorderLayout.NORTH); //arruma label1 e texto no norte da tela
		frame.add(bottomPanel, BorderLayout.CENTER); //arruma os 3 botões no centro da tela
		
		frame.setVisible(true); //serve para apresentar a tela
	}
}
