
// Calcular e imprimir el doble de un número X

package modelo;

import javax.swing.JOptionPane;

public class doblex {
    public static void main(String[] args) {
        int numero;
        int doble;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        doble = (numero * 2);
        JOptionPane.showMessageDialog(null, "El doble de " + numero + " es " + doble, "Doble Número",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}