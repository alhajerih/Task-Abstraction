class Student extends Person {
    protected String school; // Specific property for Student

    // Constructor
    public Student(String name, String school) {
        super(name); // Initialize name from Person class
        this.school = school; // Initialize school specific to Student
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(getName() + " studies at " + school);
    }
}