package edu.guilford;

public class Dog extends Animal {

    // attributes

    private String breed;

    // constructor
    public Dog() {
        super();
        // create an array of strings with breeds
        String[] breeds = { "Labrador Retriever", "German Shepherd", "Golden Retriever",
                "French Bulldog", "Bulldog", "Poodle", "Beagle", "Rottweiler", "German Shorthaired Pointer",
                "Pembroke Welsh Corgi", "Dachshund", "Yorkshire Terrier", "Australian Shepherd", "Boxer",
                "Siberian Husky",
                "Cavalier King Charles Spaniel", "Great Dane", "Miniature Schnauzer", "Doberman Pinscher", "Shih Tzu",
                "Boston Terrier",
                "Pomeranian", "Havanese", "Shetland Sheepdog", "Brittany", "English Springer Spaniel",
                "Bernese Mountain Dog", "Mastiff",
                "Cocker Spaniel", "Vizsla", "Chihuahua", "Pug", "Maltese", "Miniature American Shepherd", "Cane Corso",
                "Collie", "Basset Hound",
                "Aussiedoodle", "Pembroke Welsh Corgi", "Dachshund", "Yorkshire Terrier", "Australian Shepherd",
                "Boxer", "Siberian Husky",
                "Cavalier King Charles Spaniel", "Great Dane", "Miniature Schnauzer", "Doberman Pinscher", "Shih Tzu",
                "Boston Terrier",
                "Pomeranian", "Havanese", "Shetland Sheepdog", "Brittany", "English Springer Spaniel",
                "Bernese Mountain Dog", "Mastiff",
                "Cocker Spaniel", "Vizsla", "Chihuahua", "Pug", "Maltese", "Miniature American Shepherd", "Cane Corso",
                "Collie", "Basset Hound", "Aussiedoodle" };
        // set the breed to a random breed from the breeds array
        this.getName();
        this.breed = breeds[rand.nextInt(breeds.length)];
        // this.breed = breed;
    }
    // getters and setters

    public String getBreed() {
        return breed;
    }

    // methods

    // toString
    
    @Override
    public String toString() {
        return "Dog{" + "Name='" + getName() + '\'' + "Age='" + getAge() + '\''  +
                "breed='" + breed + '\'' + "LifeStatus='" + LifeStatus() + '\'' +
                '}';
    }

}
