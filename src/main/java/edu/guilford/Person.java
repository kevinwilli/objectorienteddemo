package edu.guilford;

public class Person extends Animal  {

    // attributes
    private String job;

    //constructor with all the person attributes
    public Person(String name, String species, int age, String job) {
        super(name, species, age);
        this.job = job;
    }


    // constructor
    public Person() {
        super();
        // create an array of strings with jobs
        String[] jobs = { "Accountant", "Actor", "Actuary", "Administrator", "Advertising Executive",
                "Aerospace Engineer", "Agricultural Engineer", "Air Traffic Controller", "Architect",
                "Archivist", "Artist", "Astronomer", "Attorney", "Audiologist", "Banker", "Barber", "Bartender",
                "Biochemist", "Biologist", "Biomedical Engineer", "Bookkeeper", "Budget Analyst", "Building Inspector",
                "Bus Driver", "Business Analyst", "Butcher", "Carpenter", "Cashier", "Chef", "Chemical Engineer",
                "Chemist",
                "Civil Engineer", "Coach", "Computer Programmer", "Construction Worker", "Cosmetologist",
                "Counselor", "Court Reporter", "Curator", "Customer Service Representative", "Dancer",
                "Database Administrator",
                "Dental Assistant", "Dentist", "Dermatologist", "Dietitian", "Doctor", "Economist", "Editor",
                "Electrician", "Engineer",
                "Entrepreneur", "Environmental Engineer", "Epidemiologist", "Event Planner", "Fashion Designer",
                "Film Director",
                "Financial Advisor", "Firefighter", "Flight Attendant", "Florist", "Food Scientist",
                "Forensic Science Technician",
                "Funeral Director", "Game Developer", "Genetic Counselor", "Geographer", "Geologist",
                "Graphic Designer",
                "Hairdresser", "Health Educator", "High School Teacher", "Historian", "Hotel Manager",
                "Human Resources Specialist",
                "Hydrologist", "Industrial Designer", "Industrial Engineer", "Insurance Agent", "Interpreter",
                "Janitor", "Journalist",
                "Judge", "Lawyer", "Librarian", "Loan Officer", "Lodging Manager", "Logistician", "Machinist",
                "Management Analyst",
                "Market Research Analyst", "Marketing Manager", "Massage Therapist", "Mechanical Engineer",
                "Medical Assistant",
                "Medical Laboratory Technician", "Medical Records Technician", "Medical Transcriptionist",
                "Meeting Planner",
                "Microbiologist", "Middle School Teacher", "Music Director", "Musician", "Nurse",
                "Occupational Therapist",
                "Optician", "Optometrist", "Paralegal", "Paramedic", "Pharmacist", "Photographer",
                "Physical Therapist" };
        this.getName();
        // set the job to a random job from the jobs array
        this.job = jobs[rand.nextInt(jobs.length)];
        // this.job = job;
    }

    // getters and setters
    public String getJob() {
        return job;
    }

    // methods

    // toString

    @Override
    public String toString() {
        return "Person{" + "Name='" + getName() + '\'' + "Age='" + getAge() + '\'' +
                "job='" + job + '\'' + "Life Status='" + LifeStatus() + '\'' +
                '}';
    }

}
