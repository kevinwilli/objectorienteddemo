package edu.guilford;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class OjectOrientedDriver 
{
    public static void main( String[] args )
    {
        //instantiate a scanner object
         Scanner scanner = new Scanner(System.in);

        // Create a new instance of the class class Animal
        Animal animal = new Animal();

        //ask the user what kind of animal they want to create
        System.out.println("What kind of animal do you want to create?");
        System.out.println("1. Dog");
        System.out.println("2. Bird");
        System.out.println("3. Person");
        System.out.println("4. Random");
        //tell the user to enter their choice
        System.out.println("Enter your choice: ");
        //get the user's choice
        int choice = scanner.nextInt();
        //if the user chose 1
        if (choice == 1) {
            //create a new instance of the class Dog
            Dog dog = new Dog();
            //set the animal to the dog
            animal = dog;
            //print out the dog toString
            System.out.println(dog.toString());
        }
        //if the user chose 2
        else if (choice == 2) {
            //create a new instance of the class Bird
            Bird bird = new Bird();
            //set the animal to the bird
            animal = bird;
            //print out the bird toString
            System.out.println(bird.toString());
        }
        //if the user chose 3
        else if (choice == 3) {
            //create a new instance of the class Person
            Person person = new Person();
            //set the animal to the person
            animal = person;
            //print out the person toString
            System.out.println(person.toString());
        }
        //if the user chose 4
        else if (choice == 4) {
            //create a new instance of the class Animal
            Animal randomAnimal = new Animal();
            //set the animal to the randomAnimal
            animal = randomAnimal;
            //print out the randomAnimal toString
            System.out.println(randomAnimal.toString());
        }
        //if the user chose anything else
        else {
            //print out that the user entered an invalid choice
            System.out.println("Invalid choice");
            //print out that the program is exiting and exit the program after 5 seconds;
            System.out.println("Exiting...");
            try {
                Thread.sleep(31000);
            } catch (InterruptedException e) {
               // e.printStackTrace();
            }
            System.exit(0);
        }
        
        //let the user know , that now we are going to compare the animals
        //EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to compare the animals");
        //ask the user how many animals they want to compare
        System.out.println("How many animals do you want to compare?");
        //get the user's choice
        int numAnimals = scanner.nextInt();
        //create an array of animals with the size of the user's choice
        Animal[] animals = new Animal[numAnimals];
        //fill the array with random animals and print it out in an array
        // don't use the toString method
        for (int i = 0; i < numAnimals; i++) {
            //create a new instance of the class Animal
            Animal randomAnimal = new Animal();
            //set the animal to the randomAnimal
            animals[i] = randomAnimal;
            //print out the randomAnimal
            System.out.println(randomAnimal);
        }
        //let the user know that we are going to sort the animals
        //EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to sort the animals");
        //sort the animals
        Arrays.sort(animals);
        //print out the sorted animals
        //let the user that this is the sorted animals
        //EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted animals");
        //loop through the animals array
        for (int i = 0; i < numAnimals; i++) {
            //print out the animal
            System.out.println(animals[i]);
        }



       



        
       

    }
}
