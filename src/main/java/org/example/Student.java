package org.example;

import java.util.ArrayList;

class Student
{
    private String studentID;
    private String firstName;
    private String lastName;
    private String dob;
    private ArrayList<Integer> grades;

    public Student(String studentID, String firstName, String lastName, String dob)
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.grades = new ArrayList<>();
    }

    public double calculateGradeAverage()
    {
        int sum = 0;
        for (int grade : grades)
        {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public boolean isExcellent()
    {
        return calculateGradeAverage() >= 28;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDob()
    {
        return dob;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public ArrayList<Integer> getGrades()
    {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades)
    {
        this.grades = grades;
    }
}
