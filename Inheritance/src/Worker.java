public class Worker extends Person
{
    private int hourlyWorked = 0;
    private double hourlyPayRate = 7.5;

    public Worker (String ID, String fName, String lName, String title, int YOB, int hourlyWorked)
    {
        super(ID, fName, lName, title, YOB);
        this.hourlyWorked = hourlyWorked;
    }

    public int getHourlyWorked() {
        return hourlyWorked;
    }

    public void setHourlyWorked(int hourlyWorked ) {
        this.hourlyWorked = hourlyWorked;
    }



    @Override
    public String toString() {
        return "Worker{" + "ID='" + this.getID() + '\'' +
                ", First Name ='" + this.getFirstName() + '\'' +
                ", Last Name ='" + this.getLastName() + '\'' +
                ", title ='" + this.getTitle() + '\'' +
                ", YOB ='" + this.getYOB() + '\'' +
                ", Number of hour worked ='" + hourlyWorked + '\'' +
                '}';
    }

    public double calculateWeeklyPay(int hourlyWorked) {
        double TotalPay = 0;
        if (hourlyWorked > 40)
        {
            TotalPay = (hourlyWorked - 40) * 1.5 * hourlyPayRate + 40 * hourlyPayRate;
        }
        else {TotalPay = hourlyWorked * hourlyPayRate;}

        return TotalPay;
    }

    public String displayWeeklyPay() {
       double regularPay = 0;
       double overtimePay = 0;
       if (hourlyWorked > 40)
       {
           regularPay = 40 * hourlyPayRate;
           overtimePay = hourlyPayRate * (hourlyWorked - 40) * 1.5;

           return  "Hours of regular pay: " + 40 + "\n" +
                   "Hours of overtime pay: " + (hourlyWorked - 40) + "\n" +
                   "Pay for regular hour: " + regularPay + "\n" +
                   "Pay of overtime hour: " + overtimePay + "\n" +
                   "This week's total: " + (regularPay + overtimePay);
       }
       else {
           regularPay = hourlyPayRate * hourlyWorked;
           overtimePay = 0;
           return  "Hours of regular pay: " + 40 + "\n" +
                   "Hours of overtime pay: " + (hourlyWorked - 40) + "\n" +
                   "Pay for regular hour: " + regularPay + "\n" +
                   "Pay of overtime hour: " + overtimePay + "\n" +
                   "This week total: " + (regularPay + overtimePay);
       }
    }
}
