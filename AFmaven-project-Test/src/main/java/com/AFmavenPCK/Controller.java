package com.AFmavenPCK;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller {
    private UI objUI;
    private Model objModel;
    
    public Controller(UI objUI, Model objModel){
        this.objUI = objUI;
        this.objModel = objModel;
        this.objUI.addFahrenheitToCelsiusListener(new FtoCListener());
        this.objUI.addCelsiusToFahrenheitListener(new CtoFListener());
    }
    
    class FtoCListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double inputTf = 0;
            try {
                inputTf = objUI.getInputTf();
                objModel.FtoC_Calculation(inputTf);
                objUI.setOutputTf(objModel.getFtoC_Calculation());
            } catch (NumberFormatException e1) {
                System.out.println(e1);
                objUI.displayErrorMessage("Enter Valid input");
            }
        }
    }

    class CtoFListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double inputTf = 0;
            try {
                inputTf = objUI.getInputTf();
                objModel.CtoF_Calculation(inputTf);
                objUI.setOutputTf(objModel.getCtoF_Calculation());
            } catch (NumberFormatException e1) {
                System.out.println(e1);
                objUI.displayErrorMessage("Enter Valid input");
            }
        }
    }
}
