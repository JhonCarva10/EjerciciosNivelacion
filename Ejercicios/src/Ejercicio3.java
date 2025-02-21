import javax.swing.*;

public class Ejercicio3 {

    private String cadena;

    public Ejercicio3(String cadena){
        this.cadena = cadena;
    }
    public String reverso(){
        String reversed = new StringBuilder(cadena).reverse().toString();
        JOptionPane.showMessageDialog(null, reversed);

        return reversed;
    }
}
