package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {
    public PositionType(String value) {
        super(value);
    }
}
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof PositionType)) return false;
//        PositionType positionType = (PositionType) o;
//        return getId() == positionType.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    //This is implementation of the hashCode method for a class.
//    // hashCode method is used to make a numerical representation
//    // of an object that is used for a lookup in hash-based data structures
//    // like HashMap, HashSet, etc. the hashCode method is overriding the default
//    // implementation provided by the Object class to generate a hash code based on the value of
//    // the id field. It uses the Objects.hash() method to generate the hash code based on the
//    // id field value.Overriding hashCode and implementing it in this way, instances of this
//    // class can be used efficiently as keys in hash-based data structures. It is worth noting
//    // that when overriding hashCode, it is important to also override the equals method to
//    // ensure that two objects with the same hash code are considered equal.
//
//
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
