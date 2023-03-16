package TemperatureConverter;

public class Model {
    private double FtoCvalue;
    private double CtoFvalue;

    public void FtoC_Calculation(double inputTf){
        FtoCvalue = (inputTf - 32) * 0.5556;
    }
    public double getFtoC_Calculation(){
        return FtoCvalue;
    }
    public void CtoF_Calculation(double inputTf){
        CtoFvalue = (inputTf * 1.8) + 32;
    }
    public double getCtoF_Calculation(){
        return CtoFvalue;
    }
}
