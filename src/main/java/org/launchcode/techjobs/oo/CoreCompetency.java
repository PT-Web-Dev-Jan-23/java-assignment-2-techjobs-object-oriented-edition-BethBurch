package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    public CoreCompetency(String value) {
//  Within the CoreCompetency class, define a constructor that takes in a single parameter called value.
        super(value); // calls a constructor in the ParentClass
//        In other words, super(value) is passing the value parameter to the constructor of the parent class JobField,
//        which in turn initializes the id field using the nextId counter, and sets the value field to the passed value.
    }

}
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }


//    public CoreCompetency(String value) {
//        this();
//        this.value = value;
//    }
//
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CoreCompetency)) return false;
//        CoreCompetency that = (CoreCompetency) o;
//        return id == that.id;
//    }
//
//
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id);
//    }
//
//    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
//    //  ONLY a getter for the 'id' field.
//    public int getId() {
//        return id;
//    }
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }



