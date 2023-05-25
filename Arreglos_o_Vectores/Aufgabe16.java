package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe16 {
    public static void main(String []args){
        Scanner entry = new Scanner(System.in);
        float [] first = new float[5];
        float [] second = new float[5];
        float [] third = new float[5];

        float  first_average = 0, second_average=0, third_average= 0, student_note;
        float average_first = 0, average_second = 0, average_third = 0, average_student;
        int position;

        System.out.println("Enter your first semester grades: ");
        for(int i=0; i<5; i++){
            System.out.print("Enter the student's grades"+(i)+": ");
            first[i] = entry.nextFloat();
            first_average += first[i];
        }

         System.out.println("Enter the grades for the second semester: ");
        for(int i=0; i<5; i++){
            System.out.print("Enter the student's grades"+(i)+": ");
            second[i] = entry.nextFloat();
            second_average += second[i];
        }

        System.out.println("Enter the grades for the third semester: ");
        for(int i=0; i<5; i++){
            System.out.print("Enter the student's grades "+(i)+": ");
            third[i] = entry.nextFloat();
            third_average += third[i];
        }

        average_first = first_average/5;
        average_second = second_average/5;
        average_third = third_average/5;

        System.out.print("Enter the student's position:");
        position = entry.nextInt();

        student_note = first[position]+ second[position]+ third[position];
        average_student = student_note/3;

        System.out.println("\nDatos: ");

        System.out.println(" Average grade of the first semester:" + average_first);
        System.out.println("Average grade of the second semester:" + average_second);
        System.out.println("Average grade of the third semester: " + average_third);
        
        System.out.println("Average grade of the student: "+average_student);


    }
}
