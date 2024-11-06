public class Teacher extends Person {

    private String subject;
    private String school;
    private double salary;
    public Teacher(String name, String subject , String school,double salary) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.salary = salary;
    }

    @Override
    void describeRole() {
        System.out.println(getName()+" teachs "+subject+ " at "+ school+" he get paid monthly "+salary+" $" );
    }
}
