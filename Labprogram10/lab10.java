package practice.awt;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class lab10 extends Frame implements ActionListener {
    TextField num1, num2;
    Label l;
    Button n;

    lab10() {
        num1 = new TextField();
        num1.setBounds(50, 50, 200, 25);
        num2 = new TextField();
        num2.setBounds(50, 100, 200, 25);
        l = new Label();
        l.setBounds(50, 150, 300, 50);
        n = new Button("Divide");
        n.setBounds(50, 200, 100, 50);
        n.addActionListener(this);
        add(n);
        add(num1);
        add(num2);
        add(l);
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
   
    }
    public void actionPerformed(ActionEvent e) {
        try {
            String n1 = num1.getText();
            String n2 = num2.getText();
            l.setText("Quotient: " + (Integer.parseInt(n1) / Integer.parseInt(n2)));
        } catch (NumberFormatException ze) {
            l.setText("Cannot divide non-integer values");
        } catch (ArithmeticException ze) {
            l.setText("Cannot divide");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        new lab10();
    }
}