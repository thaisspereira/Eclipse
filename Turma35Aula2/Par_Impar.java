package br.com.generation.condicional;

import javax.swing.JOptionPane;

public class Par_Impar {
public static void main(String[] args) {
        
        int numero = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));
        
        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é Par", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
        else {
            JOptionPane.showMessageDialog(null, "O número é Impar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

}
    