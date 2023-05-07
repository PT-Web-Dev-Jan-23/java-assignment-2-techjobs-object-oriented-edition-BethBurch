package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

//    This constructor (Job) assigns the value of nextId to the id field of the Job object,
//    and then increments nextId by 1, ensuring that each new Job object created will have a unique identifier

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();    // call the default constructor of Job using "this()"
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override    //@Override is an annotation in Java that is used to indicate that a method in a subclass
    // is intended to override a method in its superclass(JobField).
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
//StringBuilder is a class in Java that is used to create and manipulate strings.
// constructs strings  it allows you to modify the contents of the string
// without creating a new string object each time. From John
    @Override
    public String toString() {
        StringBuilder newStringData = new StringBuilder("\n" + "ID: " + getId() + "\n");
//  This code overrides the default toString method for the class and creates a new StringBuilder
//  instance with the job's ID.
        if (getName() != null) {
            newStringData.append("Name: " + getName() + "\n");
        } else {
            newStringData.append("Name: " + "Data not available" + "\n");
        }
//This code checks whether the job's name is not null and appends it to the newStringData StringBuilder if it's not
// null. Otherwise, it appends the message "Data not available" to the newStringData StringBuilder.
        if (getEmployer().toString() != null && getEmployer().toString() != "") {
            newStringData.append("Employer: " + getEmployer() + "\n");
        } else {
            newStringData.append("Employer: " + "Data not available" + "\n");
        }
        if (getLocation().toString() != null && getLocation().toString() != "") {
            newStringData.append("Location: " + getLocation() + "\n");
        } else {
            newStringData.append("Location: " + "Data not available" + "\n");
        }
        if (getPositionType().toString() != null && getPositionType().toString() != "") {
            newStringData.append("Position Type: " + getPositionType() + "\n");
        } else {
            newStringData.append("Position Type: " + "Data not available" + "\n");
        }
        if (getCoreCompetency().toString() != null && getCoreCompetency().toString() != "") {
            newStringData.append("Core Competency: " + getCoreCompetency() + "\n");
        } else {
            newStringData.append("Core Competency: " + "Data not available" + "\n");
        }
        if (
                (getName() == null || getName() == "") &&
                        (getEmployer().toString() == null || getEmployer().toString() == "") &&
                        (getLocation().toString() == null || getLocation().toString() == "") &&
                        (getPositionType().toString() == null || getPositionType().toString() == "") &&
                        (getCoreCompetency().toString() == null || getCoreCompetency().toString() == "")
        ) {
            return "OOPS! This job does not seem to exist.";
        } else {

            return newStringData.toString();
        }
    }

//  overrides the toString() method of the Object class, which is called when a String representation of an
//    object is needed. It returns a string that contains the values of the fields of a Job object.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
//These methods are used to access and modify the values of the fields from outside the class.

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
    }

    public PositionType getPositionType() {

        return positionType;
    }

    public void setPositionType(PositionType positionType) {

        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {

        this.coreCompetency = coreCompetency;
    }

}
