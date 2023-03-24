package graphic_interface;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        super("Proyecto 1");
        setSize(1000,800);   //window size
        setLocationRelativeTo(null);    //center window in the screen
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //initComponents();
    }

}
