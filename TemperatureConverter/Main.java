package TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        UI objUI = new UI();
        Model objModel = new Model();
        Controller objControl = new Controller(objUI, objModel);
        objUI.setVisible(true);
    }    
}
