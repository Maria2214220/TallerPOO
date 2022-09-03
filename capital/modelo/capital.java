// Calcule e imprima en cuántos meses, uniendo los dos capitales, pueden hacer el negocio que desean
package modelo;

import javax.swing.JOptionPane;

public class capital {
    public static void main(String[] args) {
        int c1;
        int c2;
        int c3;
        int meses;

        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital 1: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital 2: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital 3: "));
        meses = 0;

        while (c1 + c2 < c3) {
            c1 += (c1 * 0.03);
            c2 += (c2 * 0.04);
            meses++;
        }

        JOptionPane.showMessageDialog(null,
                "Para alcanzar el capital deseado de " + c3 + " pesos, se tardarían un total de " + meses + " meses.");
        System.exit(0);
    }
}