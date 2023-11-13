package project_db;

/**
 *
 * @author HP
 */
public class CarTable {
    
   private final int carID;
   private final String Make;
   private final String Model;
   private final int year;
   private final int BasePrice;
   private final String Availability;
   
    /**
     *
     * @param carID
     * @param Make
     * @param Model
     * @param year
     * @param BasePrice
     * @param Availability
     */
    public CarTable (int carID, String Make, String Model, int year, int BasePrice,String Availability){
       this.carID=carID;
       this.Make=Make;
       this.Model=Model;
       this.year=year;
       this.BasePrice = BasePrice;
       this.Availability=Availability;
   }
    
    
    // Getters
    public int getCarID() {
        return carID;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return year;
    }

    public int getBasePrice() {
        return BasePrice;
    }

    public String isAvailability() {
        return Availability;
    }

    
    
}
