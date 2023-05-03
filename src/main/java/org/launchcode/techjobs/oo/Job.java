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

    //This code defines a private method named output that takes two parameters: a String field and a String
    // dataEntered. It returns a concatenated string of field, colon and dataEntered.
    private String output(String field, String dataEntered) {
//    Inside the method, a colon variable is declared and initialized to the string value ": "
        String colon = ": ";
        if (dataEntered == null || dataEntered.isEmpty()) {
            dataEntered = "Data not available";
            //The if statement checks if dataEntered is null OR empty. If it is, dataEntered is assigned the string "Data not available".
        }
        return field + colon + dataEntered;
    }

//  overrides the toString() method of the Object class, which is called when a String representation of an
//    object is needed. It returns a string that contains the values of the fields of a Job object.
    @Override
    public String toString() {
        String idOutput = output("ID", String.valueOf(this.id));
        String nameOutput = output("Name", this.name);
        String employerOutput = output("Employer", String.valueOf(this.employer));
        String locationOutput = output("Location", String.valueOf(this.location));
        String positionTypeOutput = output("Position Type", String.valueOf(this.positionType));
        String coreCompetencyOutput = output("Core Competency", String.valueOf(this.coreCompetency));

        return "\n" +
                idOutput +
                "\n" +
                nameOutput +
                "\n" +
                employerOutput +
                "\n" +
                locationOutput +
                "\n" +
                positionTypeOutput +
                "\n" +
                coreCompetencyOutput +
                "\n";
    }

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
