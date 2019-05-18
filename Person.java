package awsopenwater;

import java.util.ArrayList;

/**
 * The Person class represents a real person who is to receive water
 * temperatures by email.
 * 
 * @author Anders Peterson
 * updated: 5/2018
 */
public class Person {
    private String name;
    private String email;
    private ArrayList<TempReading> locations = new ArrayList<>();
    
    /**
     * The constructor sets the name and email address of a Person object.
     * @param name A String that represents the person's name in real life.
     * @param email A String that represents the person's email address.
     */
    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    /**
     * The getName method is a simple accessor for the name field.
     * @return A string that contains the Person object's name field.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * The getEmail method is a simple accessor for the email field.
     * @return A string that contains the Person object's email field.
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * The getLocations method is a simple accessor for the getLocations field.
     * @return An ArrayList of type TempReading that contains each location the
     * person would like to see water temperatures for.
     */
    public ArrayList<TempReading> getLocations(){
        return this.locations;
    }
    
    /**
     * The addLocation method is a simple mutator that adds a TempReading
     * object to the locations field.
     * @param location A TempReading object representing a geographical
     * location.
     */
    public void addLocation(TempReading location){
        locations.add(location);
    }
    
    /**
     * The addWholeState method adds a TempReading object for every temperature
     * reading in a given state.
     * @param allLocations An ArrayList of TempReading objects representing
     * every temperature reading.
     * @param state A String that is expected to be two characters that
     * represent a state's abbreviation.
     */
    public void addWholeState(ArrayList<TempReading> allLocations, String state)
    {
        for(TempReading tr: allLocations){
            if(tr.getLocationName().contains(state)){
                locations.add(tr);
            }
        }
    }
    
    /**
     * The containsState method checks if this person has a certain location in
     * his/her list of locations they'd like to see. The method functions for
     * specific location names (e.g. Lake Michigan, San Onofre, Trestles) or for
     * specific states.
     * @param location  A String object representing a certain location, can be
     * a state or other location.
     * @return A boolean indicating whether the Person has the specified
     * location in the list of locations they want to go to.
     */
    public boolean containsLocation(TempReading location){
        for(TempReading tr : locations){
            if(tr.equals(location)){
                return true;
            }
        }
        return false;
    }
    
}
