/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.text.*;
 
public class Data extends JFrame{
	JLabel rotulocpf,rotulodata;
	JFormattedTextField cpf, data;
	MaskFormatter mascaracpf, mascaradata;
	public Data(){
		super("Exemplo com JFormattedTextField");
		Container tela = getContentPane();
		setLayout(null);
		rotulocpf = new JLabel("CPF: ");
		rotulodata = new JLabel("Data: ");
		
		rotulocpf.setBounds(50,120,100,20);
		rotulodata.setBounds(50,160,100,20);
		try{
                        mascaracpf = new MaskFormatter("#########-##");
			mascaradata = new MaskFormatter("##/##/####");
			mascaracpf.setPlaceholderCharacter('_');
			mascaradata.setPlaceholderCharacter('_');
		}
		catch(ParseException excp){}
		cpf = new JFormattedTextField(mascaracpf);
		data = new JFormattedTextField(mascaradata);
		cpf.setBounds(150,120,100,20);
		data.setBounds(150,160,100,20);
		tela.add(rotulocpf);
		tela.add(rotulodata);
		tela.add(cpf);
		tela.add(data);
		setSize(400, 250);
		setVisible(true);
	}
	public static void main(String args[]){
		Data app = new Data();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}