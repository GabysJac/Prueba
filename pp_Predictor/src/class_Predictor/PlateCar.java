/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_Predictor;

import java.util.Date;

/**
 *
 * @author gabys
 */
public class PlateCar {
   //class attribute
    private String textPlateCar;
    private String numberPlateCar;
    private Date dateDrive;

    public Date getDateDrive() {
        return dateDrive;
    }

    public void setDateDrive(Date dateDrive) {
        this.dateDrive = dateDrive;
    }
    

    

    public String getTextPlateCar() {
        return textPlateCar;
    }

    public void setTextPlateCar(String textPlateCar) {
        this.textPlateCar = textPlateCar;
    }

    public String getNumberPlateCar() {
        return numberPlateCar;
    }

    public void setNumberPlateCar(String numberPlateCar) {
        this.numberPlateCar = numberPlateCar;
    }

    @Override
    public String toString() {
        return "plateCar{" + textPlateCar +"-"+ numberPlateCar + '}';
    }  

    public PlateCar(String textPlateCar, String numberPlateCar) {
        this.textPlateCar = textPlateCar;
        this.numberPlateCar = numberPlateCar;
    }

    public PlateCar() {
    }
   
}
