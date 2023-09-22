package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Student[] students =
        {
            new Student("S1", "Enrico", "Drago", "22/12/1997"),
            new Student("S2", "Francesco", "Corvoli", "08/02/2000")
        };

        Professor[] professors =
        {
            new Professor("P1", "Carlo", "Casiglia", "Math"),
            new Professor("P2", "Lorenzo", "Catania", "Physics")
        };

        professors[0].assignGrade(students[0], 30);

        for (Student s : students)
        {
            if (s.isExcellent())
            {
                System.out.printf("%s %s%n", s.getFirstName(), s.getLastName());
            }
        }

        Student bestStudent = students[0];
        for (Student s : students)
        {
            if (s.calculateGradeAverage() > bestStudent.calculateGradeAverage())
            {
                bestStudent = s;
            }
        }

        System.out.printf("%s %s%n", bestStudent.getFirstName(), bestStudent.getLastName());
    }
}
