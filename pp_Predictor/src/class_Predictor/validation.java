/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_Predictor;


/**
 *
 * @author gabys
 */
public class validation {
 
    /**
     *
     * @param lastNumber
     * @param day
     * @return 
     */
    //check if the last digit of the plate corresponds to the pico y placa day
   
    public boolean validateDay(int lastNumber,int day){
    boolean state=false; 
         //sunday=1    
        if((day==2)&&(lastNumber==1||lastNumber==2)){
            System.out.println(" Monday pico y placa Day");
            state=true;
        }
        if((day==3)&&(lastNumber==3||lastNumber==4)){
        System.out.println("Tuesday pico y placa Day");
          state=true;
         }
         if((day==4)&&(lastNumber==5||lastNumber==6)){
        System.out.println("Wednesday pico y placa Day");
          state=true;
         }
        if((day==5)&&(lastNumber==7||lastNumber==8)){
        System.out.println("Thursday pico y placa Day");
          state=true;
         }
        if((day==6)&&(lastNumber==9||lastNumber==0)){
             System.out.println("Friday pico y placa Day");
          state=true;
         }
       return state;
    }
    //check if you are in pico y placa schedule
    /**
     *
     * @param hour
     * @param min
     * @return validatedPlate
     */
    public boolean validateHour(int hour,int min){
        boolean hourRestriction=false; 
        if((hour>6 && hour<10)||(hour>15 && hour<20)){//pico y placa schedule 7:00-9:30 and 16:00-19:30
            if (min>=0 && min<=30) hourRestriction=true;   
        }
        return hourRestriction;
    }
    
    //the class validates the correct plate number format

    /**
     *
     * @param plateNumber
     * @return
     */
    public boolean validatePlate(PlateCar plateNumber){
    boolean validatedPlate=false;
                  
            if(plateNumber.getTextPlateCar().length()==3&&(plateNumber.getNumberPlateCar().length()==3||plateNumber.getNumberPlateCar().length()==4)){
            if(plateNumber.getTextPlateCar().matches("[A-Z].*")==true &&  plateNumber.getNumberPlateCar().matches("[0-9].*")){ 
            validatedPlate=true;
            }
            }      
    return validatedPlate;
    }

    //gets the last digit of the numerical part of the plate

    /**
     *
     * @param s
     * @return
     */
    public int takeLastNumber(String s){
        return Character.getNumericValue(s.charAt(s.length()-1));
    }
    
}