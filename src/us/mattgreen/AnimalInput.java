package us.mattgreen;

import us.mattgreen.Cat;
import us.mattgreen.Dog;
import us.mattgreen.Teacher;

import java.util.*;

public class AnimalInput {
    public void createAnimal (ArrayList<Talkable>animals) throws BadInput {
        Scanner input = new Scanner(System.in);

        System.out.print("Would you like to create a new Cat, Dog or Teacher? 1 for cat, 2 for dog, 3 for teacher.");

        int userAnimal = input.nextInt();

        if (userAnimal == 1) {
            //gather dog information
            System.out.print("Is the dog friendly? (y or n?)");
            var userFriendly = input.next();
            boolean validBool = InputTypeVerifier.verificationBool(userFriendly);
            System.out.print("What is the dogs name?");
            var dogName = input.next();
            Dog userDog = new Dog(validBool, dogName);

            animals.add(userDog);


        } else if (userAnimal == 2) {
            //Gather cat information
            System.out.println("How many mice has the cat killed?");
            var deadMice = input.next();
            int validValue = InputTypeVerifier.verification(deadMice);
            System.out.println("What is this cats name?");
            var catName = input.next();

            Cat userCat = new Cat(validValue, catName);
            animals.add(userCat);

        } else if (userAnimal == 3) {
            //Gather Teacher Information
            System.out.println("How old is the teacher?");
            var teacherAge = input.next();
            int validValue = InputTypeVerifier.verification(teacherAge);
            System.out.println("What is the teachers name?");
            var teacherName = input.next();
            Teacher userTeacher = new Teacher(validValue, teacherName);

            animals.add(userTeacher);

        } else {
            System.out.println("Please re-read the directions.");
        }

    }

}
