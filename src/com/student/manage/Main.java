package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Press 1 to ADD student");
            System.out.println("Press 2 to DELETE student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit app");
            int c = Integer.parseInt(br.readLine());

            if(c==1)
            {
                //add student

                System.out.println("Enter user name");
                String name = br.readLine();

                System.out.println("Enter your phone");
                String phone= br.readLine();

                System.out.println("Enter your city");
                String city = br.readLine();

                Student st = new Student(name, phone, city);

                Boolean answer = StudentDao.insertStudentToDB(st);

                if(answer)
                {
                    System.out.println("Student is added successfully");
                }else{
                    System.out.println("Something went wrong. Try again!!");

                }

                System.out.println(st);



            }else if(c==2)
            {
                //delete student
                System.out.println("Enter student id to delete");
                int userId = Integer.parseInt(br.readLine());
                Boolean f= StudentDao.deleteStudent(userId);
                if(f)
                {
                    System.out.println("Deleted");
                }else{
                    System.out.println("Something went wrong");
                }

            }else if(c==3)
            {
                //display student
                StudentDao.showAllStudents();
            }else if(c==4){
                //exit app
                break;
            }else{

             }

            System.out.println("Thank you for using my application..");
            System.out.println("See you soon");

        }
    }
}
