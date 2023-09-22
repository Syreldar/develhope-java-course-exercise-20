package org.example;

class Professor
{
    private String ID;
    private String firstName;
    private String lastName;
    private String course;

    public Professor(String ID, String firstName, String lastName, String course)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public void assignGrade(Student s, int grade)
    {
        if (grade < 18)
        {
            System.out.println("You have failed");
            return;
        }

        s.getGrades().add(grade);
        System.out.println("You passed!");
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
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

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }
}
