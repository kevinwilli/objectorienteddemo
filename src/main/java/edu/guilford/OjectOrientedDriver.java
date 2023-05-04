package edu.guilford;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class OjectOrientedDriver {
    public static void main(String[] args) {
        // instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a new instance of the class class Animal
        Animal animal = new Animal();

        // ask the user what kind of animal they want to create
        System.out.println("What kind of animal do you want to create?");
        System.out.println("1. Dog");
        System.out.println("2. Bird");
        System.out.println("3. Person");
        System.out.println("4. Random");
        // tell the user to enter their choice
        System.out.println("Enter your choice: ");
        // get the user's choice
        int choice = scanner.nextInt();
        // if the user chose 1
        if (choice == 1) {
            // create a new instance of the class Dog

            Dog dog = new Dog();
            // set the animal to the dog
            animal = dog;
            // print out the dog toString
            System.out.println(dog.toString());
        }
        // if the user chose 2
        else if (choice == 2) {
            // create a new instance of the class Bird
            Bird bird = new Bird();
            // set the animal to the bird
            animal = bird;
            // print out the bird toString
            System.out.println(bird.toString());
        }
        // if the user chose 3
        else if (choice == 3) {
            // create a new instance of the class Person
            Person person = new Person();
            // set the animal to the person
            animal = person;
            // print out the person toString
            System.out.println(person.toString());
        }
        // if the user chose 4
        else if (choice == 4) {
            // create a new instance of the class Animal
            Animal randomAnimal = new Animal();
            // set the animal to the randomAnimal
            animal = randomAnimal;
            // print out the randomAnimal toString
            System.out.println(randomAnimal.toString());
        }
        // if the user chose anything else
        else {
            // print out that the user entered an invalid choice
            System.out.println("Invalid choice");
            // print out that the program is exiting and exit the program after 5 seconds;
            System.out.println("Exiting...");
            try {
                Thread.sleep(31000);
            } catch (InterruptedException e) {
                // e.printStackTrace();
            }
            System.exit(0);
        }

        // let the user know , that now we are going to compare the animals
        // EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to compare the animals");
        // ask the user how many animals they want to compare
        System.out.println("How many animals do you want to compare?");
        // get the user's choice
        int numAnimals = scanner.nextInt();
        // create an array of animals with the size of the user's choice
        Animal[] animals = new Animal[numAnimals];
        // fill the array with random animals and print it out in an array
        // don't use the toString method
        for (int i = 0; i < numAnimals; i++) {
            // create a new instance of the class Animal
            Animal randomAnimal = new Animal();
            // set the animal to the randomAnimal
            animals[i] = randomAnimal;
            // print out the randomAnimal
            System.out.println(randomAnimal);
        }
        // let the user know that we are going to sort the animals
        // EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to sort the animals");
        // sort the animals
        Arrays.sort(animals);
        // print out the sorted animals
        // let the user that this is the sorted animals
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted animals");
        // loop through the animals array
        for (int i = 0; i < numAnimals; i++) {
            // print out the animal
            System.out.println(animals[i]);
        }

        // let the user know that we are going to sort the dog by name and age
        // EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to sort the dog by name and age");
        // create an array of dogs with the size of the user's choice
        // ask the user how many dogs they want to compare
        System.out.println("How many dogs do you want to compare?");
        // get the user's choice
        int numDogs = scanner.nextInt();
        // create an array of dogs with the size of the user's choice
        Dog[] dogs = new Dog[numDogs];
        // fill the array with random dogs and print it out in an array
        // don't use the toString method
        for (int i = 0; i < numDogs; i++) {
            // create a new instance of the class Dog
            Dog randomDog = new Dog();
            // set the dog to the randomDog
            dogs[i] = randomDog;
            // print out the randomDog
            System.out.println(randomDog);
        }
        // sort the dogs by overriding the compareTo method
        Arrays.sort(dogs);
        // print out the sorted dogs
        // let the user that this is the sorted dogs
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted dogs");
        // loop through the dogs array
        for (int i = 0; i < numDogs; i++) {
            // print out the dog
            System.out.println(dogs[i]);
        }

        // let the user know that we are going to sort the bird by name and age
        // EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to sort the bird by name and age");
        // create an array of birds with the size of the user's choice
        // ask the user how many birds they want to compare

        System.out.println("How many birds do you want to compare?");
        // get the user's choice
        int numBirds = scanner.nextInt();
        // create an array of birds with the size of the user's choice
        Bird[] birds = new Bird[numBirds];
        // fill the array with random birds and print it out in an array
        // don't use the toString method
        for (int i = 0; i < numBirds; i++) {
            // create a new instance of the class Bird
            Bird randomBird = new Bird();
            // set the bird to the randomBird
            birds[i] = randomBird;
            // print out the randomBird
            System.out.println(randomBird);
        }
        // sort the birds by overriding the compareTo method
        Arrays.sort(birds);
        // print out the sorted birds
        // let the user that this is the sorted birds
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted birds");
        // loop through the birds array
        for (int i = 0; i < numBirds; i++) {
            // print out the bird
            System.out.println(birds[i]);
        }

        // let the user know that we are going to sort the person by name and age
        // EMPTY LINE
        System.out.println();
        System.out.println("Now we are going to sort the person by name and age");
        // create an array of persons with the size of the user's choice
        // ask the user how many persons they want to compare
        System.out.println("How many persons do you want to compare?");
        // get the user's choice
        int numPersons = scanner.nextInt();
        // create an array of persons with the size of the user's choice
        Person[] persons = new Person[numPersons];
        // fill the array with random persons and print it out in an array
        // don't use the toString method
        for (int i = 0; i < numPersons; i++) {
            // create a new instance of the class Person
            Person randomPerson = new Person();
            // set the person to the randomPerson
            persons[i] = randomPerson;
            // print out the randomPerson
            System.out.println(randomPerson);
        }
        // sort the persons by overriding the compareTo method
        Arrays.sort(persons);
        // print out the sorted persons
        // let the user that this is the sorted persons
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted persons");
        // loop through the persons array
        for (int i = 0; i < numPersons; i++) {
            // print out the person
            System.out.println(persons[i]);
        }

        // instantiate three object of class dog with distinct parameters for each
        // object
        Dog dog1 = new Dog("Bubba", "Dog", 5, "Labrador Retriever");
        Dog dog2 = new Dog("Rocco", "Dog", 10, "Pembroke Welsh Corgi");
        Dog dog3 = new Dog("Chico", "Dog", 3, "Chihuahua");
        // let's the user see the instantiated objects
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the instantiated dog objects");
        // print out the instantiated objects
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        // sort the dogs by overriding the compareTo method
        Dog[] dogs1 = { dog1, dog2, dog3 };
        Arrays.sort(dogs1);
        // print out the sorted dogs
        // let the user that this is the sorted dogs
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted dogs from the instantiated dog objects");
        // loop through the dogs array
        for (int i = 0; i < dogs1.length; i++) {
            // print out the dog
            System.out.println(dogs1[i]);
        }

        // onstantiate three object of class bird with distinct parameters for each
        // object
        Bird bird1 = new Bird("Tweety", "Bird", 3, 10.0);
        Bird bird2 = new Bird("Coco", "Bird", 5, 20.0);
        Bird bird3 = new Bird("Rufus", "Bird", 2, 25.0);
        // let's the user see the instantiated objects
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the instantiated bird objects");
        // print out the instantiated objects
        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println(bird3);
        // sort the birds by overriding the compareTo method
        Bird[] birds1 = { bird1, bird2, bird3 };
        Arrays.sort(birds1);
        // print out the sorted birds
        // let the user that this is the sorted birds
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted birds from the instantiated bird objects");
        // loop through the birds array
        for (int i = 0; i < birds1.length; i++) {
            // print out the bird
            System.out.println(birds1[i]);
        }

        // instantiate three object of class person with distinct parameters for each
        // object
        Person person1 = new Person("Henry", "Person", 23, "Artist");
        Person person2 = new Person("Henry", "Person", 18, "Hydrologist");
        Person person3 = new Person("Murphy", "Person", 25, "Optometrist");
        // let's the user see the instantiated objects
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the instantiated person objects");
        // print out the instantiated objects
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        // sort the persons by overriding the compareTo method
        Person[] persons1 = { person1, person2, person3 };
        Arrays.sort(persons1);
        // print out the sorted persons
        // let the user that this is the sorted persons
        // EMPTY LINE
        System.out.println();
        System.out.println("This is the sorted persons from the instantiated person objects");
        // loop through the persons array
        for (int i = 0; i < persons1.length; i++) {
            // print out the person
            System.out.println(persons1[i]);
        }

    }
}
