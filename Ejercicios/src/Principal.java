import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número:"));

            Calculadora calculadora = new Calculadora(num1, num2);


            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una operación: \n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir"));

            String resultado = "";
            switch (opcion) {
                case 1:
                    resultado = "Resultado de la suma: " + calculadora.sumar();
                    break;
                case 2:
                    resultado = "Resultado de la resta: " + calculadora.restar();
                    break;
                case 3:
                    resultado = "Resultado de la multiplicación: " + calculadora.multiplicar();
                    break;
                case 4:
                    resultado = "Resultado de la división: " + calculadora.dividir();
                    break;
                default:
                    resultado = "Opción no válida.";
            }

            JOptionPane.showMessageDialog(null, resultado);
        }

        VocalesConsonantes voc = new VocalesConsonantes();
        voc.hallarVocales();



    }
}