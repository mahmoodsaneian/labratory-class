package com.company;

/**
 * this is a class related to the a labratory class
 * and helps the teacher to manage the class more easily
 * @author Mahmood Saneian
 * @since 2021-03-08
 */
public class Lab {
    //the array of student
    private Student[] students;
    //the average of class
    private int avg;
    //the holding day of class
    private String day;
    //the capacity of class
    private int capacity;
    //the number of exists students in the class
    private int currentSize;

    /**
     *
     * @param day holding day of class
     * @param capacity capacity of class
     */
    public Lab(String day, int capacity) {
        this.day = day;
        this.capacity = capacity;
        currentSize=0;
        avg=0;
        students =new Student[capacity];
    }

    /**
     *this method check the number of exists students and capacity of class
     * and if the class capacity is not full allows the student to enter
     *
     * @param std a student who wants to enter a calssroom
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
        calculateAvg();
    }

    /**
     *
     * @param students the students of class
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * set the holding day of class
     * @param day the holding day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * set the capacity of class
     * @param capacity the capacity of class
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return the array of students
     * each element of this array contain informations of a student
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     *
     * @return the average class grades
     */
    public int getAvg() {
        return avg;
    }

    /**
     *
     * @return the holding day
     */
    public String getDay() {
        return day;
    }

    /**
     *
     * @return the capacity of class
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * this method use array of student who present in class
     * and calculate average of class
     */
    public void calculateAvg() {
        int sum=0;
        for (int i = 0;i<currentSize;i++){
            sum+=students[i].getGrade();
        }
        avg = sum / currentSize;
    }

    /**
     * this method print information of each student who present in class
     */
    public void print1() {
        System.out.println(day+":");
        for (int i = 0 ;i<currentSize;i++){
            System.out.println("firstname = "+students[i].getFirstName());
            System.out.println("lastname = "+students[i].getLastName());
            System.out.println("id = "+students[i].getId());
            System.out.println("grade = "+students[i].getGrade());
        }
        System.out.println("Average = "+avg);
    }
}
