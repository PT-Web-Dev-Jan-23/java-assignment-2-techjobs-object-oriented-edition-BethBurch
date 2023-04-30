package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

//TODO: In JobTest, define a test called testSettingJobId. Do not forget to annotate it with @Test.
// Create two Job objects using the empty constructor.
// Use assertNotEquals to verify that the IDs of the two objects are distinct.
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }
//TODO: In JobTest, define a test called testJobConstructorSetsAllFields.
// Declare and initialize a new Job object with the following data:
// Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class
// and value of each field. Your test should have 5 assert statements of each type.
    @Test
    public void testJobConstructorSetsAllFields() {
        Job setFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(setFields.getName() instanceof String);
        assertTrue(setFields.getEmployer() instanceof Employer);
        assertTrue(setFields.getLocation() instanceof Location);
        assertTrue(setFields.getPositionType() instanceof PositionType);
        assertTrue(setFields.getCoreCompetency() instanceof CoreCompetency);
        //
        // The instanceof keyword can be used to check the class of an object.
        //The result of the comparison is a boolean (aka assertTrue)
        //Example: objectName instanceof ClassName

        assertEquals("Product tester", setFields.getName());
        assertEquals("ACME", setFields.getEmployer().getValue());
        assertEquals("Desert", setFields.getLocation().getValue());
        assertEquals("Quality control", setFields.getPositionType().getValue());
        assertEquals("Persistence", setFields.getCoreCompetency().getValue());
        //
        // If you had a Job instance, you could get the name of the employer this way job is an instance of Job
        //Example: String employerName = job.getEmployer().getValue();
    }
//
//   TODO: In JobTest, define a test called testJobsForEquality.
//    Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("SOSS 4", new Employer("Wells Fargo"), new Location("STL"), new PositionType("Operations"), new CoreCompetency("Data entry"));
        Job job2 = new Job("SOSS 4", new Employer("Wells Fargo"), new Location("STL"), new PositionType("Operations"), new CoreCompetency("Data entry"));

        //to use assertFalse it needs a boolean condition initialized below
        boolean notEqual = job1.equals(job2);
        //even tho all the values are same, the id will always be unique so job1.equals(job2) will always be false
        assertFalse(notEqual);

    }
}
