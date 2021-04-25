/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.awt.event.*;
import javax.swing.*;

class ObjekGUI {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame implements ActionListener {
      final JTextField fpertama = new JTextField(50);
      JLabel lpertama = new JLabel(" Masukkan Angka ");
      final JTextField fkedua = new JTextField(50);
      JLabel lkedua = new JLabel(" Masukkan Angka ");
      final JTextField fhasil = new JTextField(50);
      JLabel lhasil = new JLabel(" Hasil ");
      final JTextField fsyarat = new JTextField(0);
      JLabel lsyarat = new JLabel(" *Hanya Angka Saja ");
      
    JButton btambah = new JButton("+");
    JButton bkurang = new JButton("-");
    JButton bkali = new JButton("x");
    JButton bbagi = new JButton("/");
    JButton bclear = new JButton("C");

      ButtonGroup group = new ButtonGroup();
   public GUI() {
	setTitle(" Kalkulator ");
	setDefaultCloseOperation(3);
	setSize(500,500);

	

	setLayout(null);
	add(lpertama); add(fpertama); add(lkedua); add(fkedua);
        add(lhasil); add(fhasil); add(lsyarat); add(fsyarat);
        add(btambah); add(bkurang); add(bkali); add(bbagi);
        add(bclear);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        
	lpertama.setBounds(30,30,220,50);
	fpertama.setBounds(150,30,150,50);
	lkedua.setBounds(30,100,220,50);
	fkedua.setBounds(150,100,150,50);
        lhasil.setBounds(30,170,220,50);
	fhasil.setBounds(150,170,150,50);
        lsyarat.setBounds(30,240,220,50);
        fsyarat.setBounds(0,0,0,0);
	btambah.setBounds(10,300,75,40);
        bkurang.setBounds(130,300,75,40);
        bkali.setBounds(10,370,75,40);
        bbagi.setBounds(130,370,75,40);
        bclear.setBounds(250,300,75,40);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        fpertama.addActionListener((ActionListener) this);
        fkedua.addActionListener((ActionListener) this);
        btambah.addActionListener((ActionListener) this);
        bkurang.addActionListener((ActionListener) this);
        bkali.addActionListener((ActionListener) this);
        bbagi.addActionListener((ActionListener) this);
        bclear.addActionListener((ActionListener) this);
   }
   //rumus tambah, kurang, kali, bagi, dan cancel
   public void actionPerformed(ActionEvent e){
        float a1, a2, hasil;
        
        if(e.getSource() == btambah){
            a1 = Float.valueOf(fpertama.getText());
            a2 = Float.valueOf(fkedua.getText());
            hasil = a1 + a2;
            fhasil.setText(String.valueOf(hasil));
        }
        
            if(e.getSource() == bkurang){
            a1 = Float.valueOf(fpertama.getText());
            a2 = Float.valueOf(fkedua.getText());
            hasil = a1 - a2;
            fhasil.setText(String.valueOf(hasil));
        }
        
        if(e.getSource() == bkali){
            a1 = Float.valueOf(fpertama.getText());
            a2 = Float.valueOf(fkedua.getText());
            hasil = a1 * a2;
            fhasil.setText(String.valueOf(hasil));
        }
        
            if(e.getSource() == bbagi){
            a1 = Float.valueOf(fpertama.getText());
            a2 = Float.valueOf(fkedua.getText());
            hasil = a1 / a2;
            fhasil.setText(String.valueOf(hasil));
        }        
        
        if(e.getSource() == bclear){
             fpertama.setText("");
             fkedua.setText("");
             fhasil.setText("");
        }
        
    }
}