import javax.swing.*;

public class VocalesConsonantes {
    String text;
    String textMin;
    int vocales;
    int consonantes;
    public void hallarVocales(){

        text = JOptionPane.showInputDialog("Escriba una palabra");
        textMin = text.toLowerCase();

        for (int i= 0; i < textMin.length() ; i++){
            if (textMin.charAt(i) == 'a' || textMin.charAt(i) == 'e' ||
                    textMin.charAt(i) == 'i' || textMin.charAt(i) == 'o'  || textMin.charAt(i) == 'u') {
                vocales++;
            }else{
                consonantes ++;
            }
        }
        System.out.println("El número de vocales son: " + vocales + " y el número de cosonantes son: " + consonantes);
    }
}
