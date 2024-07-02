import java.util.Scanner;
//a class to store all the variables for program with all the variavles privated to remain unchanged
public class Pet{
    private String petType;
    private String petName;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;



    public Pet(){
       //empty constructor for default values
    } 
    //setter method to gather pet's Type
    public void setPetType(String petType){
      this.petType = petType;
    }
    //getter method to return pet's type
    public String getPetType(){
      return petType;
    }

    public void setPetName(String petName){
      this.petName = petName;
    }
//
    public String getPetName(){
      return petName;
    }
     //setter method to set pet age to user input 
    public void setPetAge(int petAge){
      this.petAge = petAge;
    }
    //"getter" to return pet age
    public int getPetAge(){
      return petAge;
    }
    
    public void setDogSpaces(int dogSpaces){
      this.dogSpaces = dogSpaces; 
    }
 
    public int getDogSpaces(){
      return dogSpaces;
      }
    
    public void setCatSpaces(int catSpaces){
      this.catSpaces = catSpaces; 
    }
    public int getCatSpaces(){
      return catSpaces;
    }
    public void setDaysStay(int daysStay){
      this.daysStay = daysStay;
    }
    public int getDaysStay(){
      return daysStay;
    }
    public void setAmountDue(double amountDue){
      this.amountDue = amountDue;
    }
    
    public double getAmountDue(){ 
      return amountDue;
    }
}   
  