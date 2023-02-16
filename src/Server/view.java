package Server;

import javax.swing.*;

public class view {
    private JPanel panel;
    private JButton skicka;
    private JButton quit;
    private JEditorPane input;
    private JFormattedTextField output;

    public view(){
    }
    public JPanel getPanel(){
        return panel;
    }
    public String getinput(){
        return input.getText();
    }



}
