package com.aleksei;


public class GradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int avgGrade = (s1 + s2 + s3) / 3;
        if (avgGrade >= 90 && avgGrade <= 100) return 'A';
        else if (avgGrade >= 80 && avgGrade <= 90) return 'B';
        else if (avgGrade >= 70 && avgGrade <= 80) return 'C';
        else if (avgGrade >= 60 && avgGrade <= 70) return 'D';
        else return 'F';
    }
}
