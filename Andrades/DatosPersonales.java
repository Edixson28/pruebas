package Andrades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DatosPersonales extends JFrame implements ActionListener{        


	public JTextField TxT, TxT2, TxT3;

	public JTextArea direccion;

	public JButton btn, btn2;

	public JMenuItem comando;

	

	public DatosPersonales(){

	String[] course = { "Masculino", "Femenino"};	



	JPanel P1 = new JPanel();

	JPanel P2 = new JPanel();

	JPanel P3 = new JPanel();

	JPanel P4 = new JPanel();

	JPanel P5 = new JPanel();

	JPanel P6 = new JPanel();

	JPanel P7 = new JPanel();

	JPanel P8 = new JPanel();

	JPanel P9 = new JPanel();

	

	JLabel lbl = new JLabel("Cedula: ");

	JLabel lbl2 = new JLabel("Nombre: ");

	JLabel lbl3 = new JLabel("Apellido: ");

	JLabel lbl4 = new JLabel("Sexo: ");

	

	//Campo de Seleccion

	JCheckBox leng1 = new JCheckBox("Lenguaje C");

	JCheckBox leng2 = new JCheckBox("C++");

	JCheckBox leng3 = new JCheckBox("Java");

	
	

	//*==Campo de Texto==*//

    //Texto Cedula

	TxT = new JTextField(10);

	//Texto  Nombre:

	TxT2 = new JTextField(10);

	//Texto Apellido

	TxT3 = new JTextField(10);

	//Texto Direccion

	direccion = new JTextArea("Escriba su direccion: ",5, 20);

	


	btn = new JButton("Limpiar");

	btn2 = new JButton("Salir");

	JButton btn3 = new JButton("Guardar");

	JComboBox jce = new JComboBox(course);

	JLabel mensaje = new JLabel("Seleccione sus habilidades");

	

	//Barra Menu

    JMenuBar barra = new JMenuBar();

    JMenu menu = new JMenu("Archivo");

    comando = new JMenuItem("Salir");




    	P1.setLayout(new GridLayout(9,1));

		P2.setLayout(new FlowLayout());

		P3.setLayout(new FlowLayout());

		P4.setLayout(new FlowLayout());

		P5.setLayout(new FlowLayout());

		P6.setLayout(new FlowLayout());

		P7.setLayout(new FlowLayout());

		P8.setLayout(new FlowLayout());

		P9.setLayout(new FlowLayout());

		

		//CAMPO TEXTO

		 //Texto Cedula

		P2.add(lbl);

		P2.add(TxT);

		 //Texto  Nombre:

		P3.add(lbl2);

		P3.add(TxT2);

		 //Texto  Apellido:

		P4.add(lbl3);

		P4.add(TxT3);

		 //Seleccion de Sexo

		P5.add(lbl4);

		P5.add(jce);

		 //Botones

		P6.add(btn);

		btn.addActionListener(this);

		P6.add(btn2);

		btn2.addActionListener(this);

		P6.add(btn3);

		 //Texto Direccion

		P7.add(direccion);
		

		//Campo de Seleccion de conocimiento

		P8.add(mensaje);

		P9.add(leng1);

		P9.add(leng2);

		P9.add(leng3);

		

		//BARRA DE MENU

		P1.add(barra);

		P1.add(menu);

		P1.add(comando);

	    comando.addActionListener(this);

	    menu.add(comando);

	    barra.add(menu);

	    setJMenuBar(barra);

		

		this.add(P1);

		P1.add(P2);

		P1.add(P3);

		P1.add(P4);

		P1.add(P5);

		P1.add(P6);

		P1.add(P7);

		P1.add(P8);

		P1.add(P9);

		add(P1);

		

		this.setTitle("Datos Personales");

		this.pack();

		this.setVisible(true);
	

	} 

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.btn)){

    		this.TxT.setText("");

			}

        if (e.getSource().equals(this.btn)){

    		this.TxT2.setText("");

			}

        if (e.getSource().equals(this.btn)){

    		this.TxT3.setText("");

			}

        if (e.getSource().equals(this.btn)){

    		this.direccion.setText("");

			}

        if (e.getSource().equals(this.btn2)){

        System.exit(0);

        }

        if (e.getSource().equals(this.comando)){

        System.exit(0);

        }
    }

}