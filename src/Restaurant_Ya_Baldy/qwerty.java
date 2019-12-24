package Restaurant_Ya_Baldy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class qwerty {
    private JTextField textField_name;
    private JPanel panel1;
    private JTextField textField_telephone;
    private JButton create;
    private JButton getAll;
    private JTextArea textArea1;
    CustomerDAO customerDAO=new CustomerDAO();

    public qwerty() {
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aasasasasasas");
            }
        });
    }
}
