package awsopenwater;

/**
 *  The TempReading class represents a geographic location from which
 * temperatures are to be pulled.
 * 
 * @author Anders Peterson
 * updated: 5/2018
 */
public class TempReading {
    private String locationName;
    private String pubDate;
    private double fTemp;
    private double cTemp;
    
    /**
     * The constructor sets the name of the location, the published date,
     * and the water temperature in Fahrenheit.
     * @param locationName A String representing the name of the location
     * @param pubDate A String containing the date and time of the last time
     * that the temperature was recorded
     * @param fTemp A double representing the water temperature in Fahrenheit
     */
    public TempReading(String locationName, String pubDate, double fTemp){
        this.locationName = locationName;
        this.pubDate = pubDate;
        this.fTemp = fTemp;
        this.cTemp = (double) (((int) (fTemp - 32.0)*0.55)*100)/100;
    }
    
    /**
     * A simple mutator to assign the pubDate field.
     * @param pubDate A String containing the date and time of the last time
     * that the water temperature was recorded.
     */
    public void setDate(String pubDate){
        this.pubDate = pubDate;
    }
    
    /**
     * A simple mutator to assign the fTemp field. The method also assigns the
     * cTemp field by calculating the temperature in Celcius.
     * @param fTemp A double value representing the temperature in Fahrenheit
     */
    public void setTemp(double fTemp){
        this.fTemp = fTemp;
        this.cTemp = fTemp - (32.0)*(0.55);
    }
    
    /**
     * A simple accessor method to get the locationName field.
     * @return The locationName field that's type String
     */
    public String getLocationName(){
        return this.locationName;
    }
    
    /**
     * A simple accessor method to get the pubDate field.
     * @return The pubDate field that's type String
     */
    public String pubDate(){
        return this.pubDate;
    }
    
    /**
     * A simple accessor method to get the fTemp field.
     * @return The fTemp field that's type double.
     */
    public double getFTemp(){
        return this.fTemp;
    }
    
    /**
     * A simple accessor method to get the cTemp field.
     * @return The cTemp field that's type double.
     */
    public double getCTemp(){
        return this.cTemp;
    }
    
    /**
     * Checks if another TempReading object is the same as this one.
     * @param tr A TempReading object to be checked against this one.
     * @return True if this object is the same as the given TempReading object.
     */
    public boolean equals(TempReading tr){
        return this.locationName.equals(tr.getLocationName());
    }
}
