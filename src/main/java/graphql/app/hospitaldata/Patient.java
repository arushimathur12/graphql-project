package graphql.app.hospitaldata;


public class Patient{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double timeInHospital;
    private Nurse nurse;

    public Patient(int id, String firstName, String lastName, int age, double timeInHospital, Nurse nurse) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.timeInHospital = timeInHospital;
        this.nurse = nurse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTimeInHospital() {
        return timeInHospital;
    }

    public void setTimeInHospital(double timeInHospital) {
        this.timeInHospital = timeInHospital;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

}