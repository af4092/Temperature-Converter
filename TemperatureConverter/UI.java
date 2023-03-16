package TemperatureConverter;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI extends JFrame{
    private JLabel inputLb = new JLabel("Input Temperature");
    private JTextField inputTf = new JTextField(10);
    private JLabel outputLb = new JLabel("Output Temperature");
    private JButton FtoCbtn = new JButton("Fahrenheit to Celsius");
    private JButton CtoFbtn = new JButton("Celsius to Fahrenheit");
    private JTextField outputTf = new JTextField(10);
    
    UI(){
        JPanel tempPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 100);

        tempPanel.add(inputLb);
        tempPanel.add(inputTf);
        tempPanel.add(FtoCbtn);
        tempPanel.add(CtoFbtn);
        tempPanel.add(outputLb);
        tempPanel.add(outputTf);    
        this.setTitle("Temperature Converter");
        this.setIconImage(new ImageIcon("g:\\프랭키\\java practice\\TemperatureConverter\\temp2.png").getImage());
        this.add(tempPanel);
    }
    
    public double getInputTf(){
        return Double.parseDouble(inputTf.getText());
    }
    public double getOutputTf(){
        return Double.parseDouble(outputTf.getText());
    }
    public void setOutputTf(double outputRes){
        outputTf.setText(Double.toString(outputRes));
    }
    void addFahrenheitToCelsiusListener(ActionListener listenForFtoCbutton){
        FtoCbtn.addActionListener(listenForFtoCbutton);
    }
    void addCelsiusToFahrenheitListener(ActionListener listenForCtoFbutton){
        CtoFbtn.addActionListener(listenForCtoFbutton);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    public void FtoCListener(Controller.FtoCListener fToCListener){
    }
    public void addFtoCListener(Controller.FtoCListener fToCListener){

    }
    public void CtoFListener(Controller.CtoFListener cTofListener){
    }
    public void addCtoFListener(Controller.CtoFListener cTofListener){
    }
}
