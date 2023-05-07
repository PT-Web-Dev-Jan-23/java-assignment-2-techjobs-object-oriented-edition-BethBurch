package org.launchcode.techjobs.oo;

import java.util.Objects;

//TODO: Create a new class called JobField
// what code to put in the JobField class:
// What fields/constructors/getters&setters/methods do ALL FOUR of the classes have in common?
// id, nextId, value/(String value) and () empty for setting nextId/getId, getValue, setValue/toString, equals, hashCode
// In JobField, declare each of the common fields.
// Code the constructors.Use Generate to create the appropriate getters and setters.
// prevent the creation of a JobField object, make this class abstract.

// An abstract class is used when you want to define a common interface that multiple classes can share,
// but you do not want to provide a complete implementation of the methods.
//An abstract class cannot be instantiated directly, which means you cannot create an object of an abstract class.
// Instead, you need to extend the abstract class and provide an implementation for its abstract methods.
public abstract class JobField {
    //Fields in common
    private int id;
    private static int nextId = 1;
    private String value;

    //Constructors in common

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this(); //calls first constructor to initialize the id field
        this.value = value; //initializes the value field for a new JobField object
    }

    //custom methods
    @Override //creates String from value
    public String toString() {

        return value;
    }

    @Override     // This is the boolean from Richard//Override the equals() method of the class
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        //Check if the current object and the object to be compared are the same. If yes, return true
        if (toBeCompared == null) return false;
        //Check if the object to be compared is null. If yes, return false
        if (getClass() != toBeCompared.getClass()) return false;
//Check if the class of the object to be compared is the same as the class of the current object. If not, return false
        JobField newJobField = (JobField) toBeCompared;
//Create a new object of the same class as the current object and cast the object to be compared to this new object
        if (getId() != newJobField.getId()) {
            //Check if the id of the current object is equal to the id of the new object. If not, return false
            return false;
        }

        return id == newJobField.id;

    }

    @Override //generate a hash code based on the value of the id field
    public int hashCode() {

        return Objects.hash(getId());
    }
    //Use generate for getters and Setters

    public int getId() {

        return id;
    }


    public String getValue() {

        return value;
    }

    public void setValue(String value) {
    this.value = value;
    }
}
