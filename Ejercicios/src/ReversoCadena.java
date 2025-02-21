import javax.swing.*;

public class ReversoCadena {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese la palabra para realizar el reverso: ");
        Ejercicio3 reverso = new Ejercicio3(cadena);
        System.out.println("reverse(" + reverso + ") = " + reverso.reverso());

    }
}
