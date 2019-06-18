/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Tejasv Pratap Tyagi
 */
public class StudentDatabaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ask how many Students u want to add
        System.out.println("Enter number of students to enroll");
        Scanner in=new Scanner(System.in);
        int numOfStudents = in.nextInt();
        //Create n number of students.
        Student[] students = new Student[numOfStudents];
        for(int n=0;n<numOfStudents;n++){
       students[n] = new Student();
        students[n].enroll();
        students[n].payTution();
        System.out.println(students[n].showInfo());
       }
       for(int n=0;n<numOfStudents;n++){
        System.out.println(students[n].showInfo());
       }
    }
    
}
