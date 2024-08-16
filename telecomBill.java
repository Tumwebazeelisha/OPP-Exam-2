/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author ELISHA
 */
public class telecomBill {
     public static void main(String[] args) {
        // we define our variables
        double loadAmount=10000; 
        double initialChargePercentage=0.10; 
        double callRatePerSecond=200; 
        int callDurationMinutes = 5; 
        
        //we calculate our initial charge
        double initialCharge= loadAmount*initialChargePercentage;
        //we calculate the call duration
        int callDurationSeconds=callDurationMinutes*60;
        
        //we calculate the total cost
        double totalCallCost=callDurationSeconds*callRatePerSecond;
        //we calculate remaining balance
        double remainingBalance =loadAmount-initialCharge-totalCallCost;
        //this is then the output
        System.out.printf("Remaining balance: UGX%.2f%n",remainingBalance);
    }
}
    

