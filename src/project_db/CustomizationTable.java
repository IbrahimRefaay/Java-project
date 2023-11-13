/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_db;

/**
 *
 * @author HP
 */
public class CustomizationTable {
    private int CustomizationID;
    private int carID;
    private String Option;
    private int OptionPrice;
    
    
    public CustomizationTable(int CustomizationID, int carID, String Option, int OptionPrice){
          this.CustomizationID = CustomizationID;
          this.carID = carID;
          this.Option  = Option;
          this.OptionPrice = OptionPrice;
    }
    
    
    public int getCustomizationID(){
        return CustomizationID;
    }
    
    public int getcarID(){
        return carID;
    }
    
    public String getOption(){
        return Option;
    }
    
    
    public int getOptionPrice(){
        return OptionPrice;
    }
    
    
    
}
