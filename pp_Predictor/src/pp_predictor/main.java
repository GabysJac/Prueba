/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_predictor;

import class_Predictor.PlateCar;
import class_Predictor.validation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author gabys
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PlateCar pCar= new PlateCar();
        validation validate=new validation();
        SimpleDateFormat formatter=new SimpleDateFormat("YYYY/MM/DD HH:mm");   
        GregorianCalendar calendar = new GregorianCalendar(); 
        
        System.out.println("Enter the plate number ABC-123 or ABC-1234");
        String inKey = "";
        Scanner inScanner = new Scanner (System.in); 
        inKey = inScanner.nextLine (); 
        String st[]=inKey.split("-",2);
        pCar.setTextPlateCar(st[0]);
        pCar.setNumberPlateCar(st[1]);
        
        if(validate.validatePlate(pCar)==true){
            
            System.out.println ("Correct plate");
            System.out.println("enter a date and time AAAA/MM/DD HH:mm");
            inKey = inScanner.nextLine (); 
            try{
              
            pCar.setDateDrive( formatter.parse(inKey));//format the date
            calendar.setTime(pCar.getDateDrive());
                            
                if(validate.validateDay(validate.takeLastNumber(pCar.getNumberPlateCar()), calendar.get(Calendar.DAY_OF_WEEK))==true){
                    if((validate.validateHour(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE)))==true){
                    System.out.println("The car can n't circulate during this time");
                    }
                    else System.out.println("The car can circulate during this time");
                }
                else{System.out.println("The car can circulate during this time");
                }
            } catch (ParseException e) {
            System.out.println ("El error es: " + e.getMessage());
               
    }
        }
        else System.out.println ("Incorrect plate");
        
    }
    
    
}

       
    