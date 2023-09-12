import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        Worker worker1 = new Worker("001", "Jaqueline","Webb", "Mr.",1982, 45);
        Worker worker2 = new Worker("002", "Braidy","Carman", "Mrs.",1986, 40);
        Worker worker3 = new Worker("003", "Branson","Collins", "Mr.",1990, 50);
        SalaryWorker worker4 = new SalaryWorker("004", "Randal","Radclyffe", "Mr.",1992, 40, 31200);
        SalaryWorker worker5 = new SalaryWorker("005", "Dorinda","Chaplin", "Mr.",2000, 55, 42900);
        SalaryWorker worker6 = new SalaryWorker("006", "Huy","Nguyen", "Mr.",2004, 40, 20800);
        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        workerList.add(worker4);
        workerList.add(worker5);
        workerList.add(worker6);

        for (int week = 1; week < 4; week++) {
            System.out.printf("%8s%8s%15s%15s%10s%10s%15s%20s", "Week" + week, "ID", "First Name", "Last Name", "Title", "YOB", "Hour worked", "Weekly pay");
            System.out.println();
            for (int i = 1; i < 101; i++){
                System.out.print("=");
            }
            System.out.println();
            if(week == 1)
            {
                for(Worker person : workerList)
                {
                    System.out.printf("%8s%8s%15s%15s%10s%10s%12s%18s"," ", person.getID(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB(), person.getHourlyWorked(), Math.round(person.calculateWeeklyPay(40)));
                    System.out.println();
                }
                System.out.println();
            }
            if(week == 2)
            {
                for(Worker person : workerList)
                {
                    System.out.printf("%8s%8s%15s%15s%10s%10s%12s%18s"," ", person.getID(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB(), person.getHourlyWorked(), Math.round(person.calculateWeeklyPay(50)));
                    System.out.println();
                }
                System.out.println();
            }
            if(week == 3)
            {
                for(Worker person : workerList)
                {
                    System.out.printf("%8s%8s%15s%15s%10s%10s%12s%18s"," ", person.getID(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB(), person.getHourlyWorked(), Math.round(person.calculateWeeklyPay(40)));
                    System.out.println();
                }
                System.out.println();
            }
        }


        }
    }






