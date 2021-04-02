package com.company;

/**
 * this is a class related to a student
 * each student has some property an behavior
 *
 * @author Mahmood Saneian
 * @since 2021-03-08
 */
public class Student {
    //the first name of student
    private String firstName;
    //the last name of student
    private String lastName;
    //the id number of student
    private String id;
    //the grade of student
    private int grade;

    /**
     * Create a new student with name and ID number
     *
     * @param firstName show first name of student
     * @param lastName  show last name of student
     * @param id   show id number for student
     */
    public Student(String firstName, String lastName, String id) {
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        grade = 0;
    }

    /**
     * @param firstName set first name of a student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName set last name of a student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param id set id number of a student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param grade set grade of a student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * get the first name of student * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get the last name of student * @return the lastname field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get the id number of student * @return the id field
     */
    public String getId() {
        return id;
    }

    /**
     * get the grade of student * @return the grade field
     */
    public int getGrade() {
        return grade;
    }

    /**
     * this method print information of a student
     */
    public void print() {
        System.out.println("firstname = " + firstName);
        System.out.println("lastname = " + lastName);
        System.out.println("id = " + id);
        System.out.println("grade = " + grade);
    }
}
