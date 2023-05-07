package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

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
// Declare and initialize a new Job object(setFields) with the following data:
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

        assertEquals("Product tester", setFields.getName());
        assertEquals("ACME", setFields.getEmployer().getValue());
        assertEquals("Desert", setFields.getLocation().getValue());
        assertEquals("Quality control", setFields.getPositionType().getValue());
        assertEquals("Persistence", setFields.getCoreCompetency().getValue());

    }
//
//   TODO: In JobTest, define a test called testJobsForEquality.
//    Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        //to use assertFalse it needs a boolean condition initialized below
        boolean notEqual = job1.equals(job2);
        //even tho all the values are same, the id will always be unique so job1.equals(job2) will always be false
        assertFalse(notEqual);
    }

// When passed a Job object, it should return a string that contains a blank line before and after the job information.
//The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
//If a field is empty, the method should add, “Data not available” after the label?
//     (Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job setFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String testingJobClass = setFields.toString();
        assertEquals(testingJobClass.charAt(0), '\n');
        assertEquals(testingJobClass.charAt(testingJobClass.length() - 1), '\n');

    }
//    TODO: Code a new test for the second required behavior, named testToStringContainsCorrectLabelsAndData.
//     Then run the tests to make sure the new one fails.
//     Modify toString to make the new test pass. Also, make sure that your updates still pass all of the old tests.
//     Follow the same TDD process for the third requirement,
//     creating a test named testToStringHandlesEmptyField.

    @Test // removed the plus 1 to set fields
    public void testToStringContainsCorrectLabelsAndData() {
        Job setFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String testingJobClass = setFields.toString();
        assertEquals(testingJobClass, "\nID: " + (setFields.getId()) + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality Control\n" +
                "Core Competency: Persistence\n");
    }
//    @Test
//    public void testToStringHandlesEmptyField() {
//        String testingJobClass = testingJobClass.toString();
//        String expectedValue = “OOPS! This job does not seem to exist.”;
//        assertEquals(expectedValue, testingJobClass.toString());
//    }

    @Test
    public void testToStringHandlesEmptyField() {

        Job testJobClass = new Job("Product tester", new Employer("ACME"), new Location(null), new PositionType(null), new CoreCompetency(null));
//new Job object (testJobClass)
        String expectedValue = "\n" + "ID: " + testJobClass.getId() + "\n" +
                "Name: " + testJobClass.getName() + "\n" +
                "Employer: " + testJobClass.getEmployer() + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n";

        assertEquals(expectedValue, testJobClass.toString());
//assertEquals method is used to compare the expected value with the actual result of calling the toString
// method on the testJobClass object. If the values are not equal, the test will fail.
    }
    }


