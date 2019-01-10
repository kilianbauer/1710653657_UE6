import javax.swing.*;

public class Aufgabe1 {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Gib etwas ein");
        String b = JOptionPane.showInputDialog("Gib noch etwas ein");
        String c = JOptionPane.showInputDialog("Gib ein weiters mal etwas ein");

        if (a.substring(0, 3).equals(b.substring(0, 3))) {
            System.out.println("Die ersten drei Zeichen von a und b sind gleich");
        } else if (a.substring(0, 3).equals(c.substring(0, 3))) {
            System.out.println("Die ersten drei Zeichen von a und c sind gleich");
        } else if (b.substring(0, 3).equals(c.substring(0, 3))) {
            System.out.println("Die ersten drei Zeichen von b und c sind gleich");
        } else {
            System.out.println("Die ersten drei Zeichen sind nicht gleich");
        }
    }
}
