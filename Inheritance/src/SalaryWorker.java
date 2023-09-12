public class SalaryWorker extends Worker{

    private double annualSalary = 0;


    @Override
    public double calculateWeeklyPay(int hourlyWorked) {
        return annualSalary/52;
    }

    public String displayWeeklyPay() {
        double WeeklyPay = annualSalary/52;
        return  super.getFirstName() + " " + super.getLastName() +" " +  " weekly pay is " + WeeklyPay + "\n" +
                " annual salary is " + annualSalary;

    }

    public SalaryWorker (String ID, String fName, String lName, String title, int YOB, int hourlyWorked, double annualSalary) {
        super(ID, fName, lName, title, YOB, hourlyWorked);
        this.annualSalary = annualSalary;

    }
    public String toString() {
        return "SalaryWorker{" + "ID='" + this.getID() + '\'' +
                ", First Name ='" + this.getFirstName() + '\'' +
                ", Last Name ='" + this.getLastName() + '\'' +
                ", title ='" + this.getTitle() + '\'' +
                ", YOB ='" + this.getYOB() + '\'' +
                ", Annual salary ='" + annualSalary + '\'' +
                '}';
    }

}
