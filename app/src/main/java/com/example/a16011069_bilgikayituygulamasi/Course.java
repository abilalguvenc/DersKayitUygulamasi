package com.example.a16011069_bilgikayituygulamasi;
import java.util.ArrayList;

/*
public class Course
{
    public String cName, cPop, cAvg, cPnt;

    public Course (String name, String population, String gradeAvg, String grade)
    {
        cName = name;
        cPop = population;
        cAvg = gradeAvg;
        cPnt = grade;
    }
}
*/

public class Course {

    String cName, cPop, cAvg, cGrade;

    public Course ()
    {

    }

    public Course (String name, String population, String averageGrade, String grade)
    {
        cName = name;
        cPop = population;
        cAvg = averageGrade;
        cGrade = grade;
    }

    public String getName () { return cName; }
    public void setcName (String name) { this.cName = name; }

    public String getPopulation () { return cPop; }
    public void setPopulation (String pop) { this.cPop = pop; }

    public String getGradeAverage () { return cAvg; }
    public void setGradeAverage (String avg) { this.cAvg = avg; }

    public String getGrade () { return cGrade; }
    public void setGrade (String grade) { this.cGrade = grade; }

    public static ArrayList<Course> getData()
    {
        ArrayList<Course> courseList = new ArrayList<Course>();
        String[] cNames = {"Introduction to Mobile Programming", "Introduction to Game Development", "Artificial Intelligence", "Network Technologies", "Software Engineering", "Numerical Analysis", "Behaviour Sciences"};
        String[] cPops = {"54", "50", "45", "145", "60", "86", "73"};
        String[] cAvg = {"79", "90", "72", "32", "67", "72", "42"};
        String[] cGrade = {"95", "97", "58", "42", "77", "56", "21"};

        for (int i = 0; i < cNames.length; i++)
        {
            Course temp = new Course();
            temp.setcName (cNames[i]);
            temp.setPopulation (cPops[i]);
            temp.setGradeAverage (cAvg[i]);
            temp.setGrade (cGrade[i]);

            courseList.add(temp);
        }

        return courseList;
    }
}