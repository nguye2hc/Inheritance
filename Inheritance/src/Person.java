import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Person {

    private String ID;

    private String FirstName;

    private String LastName;

    private String title;

    private int YOB;

    private int year;


    public Person(String ID, String fName, String lName, String title, int YOB) {
        this.ID = ID;
        this.FirstName = fName;
        this.LastName = lName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String fName) {
        this.FirstName = fName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(ID, person.ID) && Objects.equals(FirstName, person.FirstName) && Objects.equals(LastName, person.LastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, FirstName, LastName, title, YOB);
    }

    public String getLastName() {
        return LastName;
    }

    public void setlName(String lName) {
        this.LastName = lName;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getYOB(){
        return YOB;
    }

    public void setYOB(int YOB){
        this.YOB = YOB;
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", fName='" + FirstName + '\'' +
                ", lName='" + LastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String toCSVDataRecord()
    {
        return ID + "' " + FirstName + ", " + LastName + ", " + title + ", " + YOB;
    }


    public String getFullName()
    {
        return FirstName + " " + LastName;
    }

    public String getFormalName()
    {
        return title + " " + FirstName + " " + LastName;
    }

    public Integer getYear(){Calendar calendar = Calendar.getInstance();
        return year = calendar.get(Calendar.YEAR);}

    public Integer getAge() {return year - YOB;}

}
