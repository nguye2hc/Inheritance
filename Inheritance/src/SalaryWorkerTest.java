public class SalaryWorkerTest {
    public static void main(String[] args) {

        SalaryWorker Huy = new SalaryWorker("123456", "Huy", "Nguyen", "Salary Worker", 2004,  45, 20800);
        Huy.setFirstName("Huy");

        System.out.println(Huy);

        System.out.println(Huy.calculateWeeklyPay(45));

        System.out.println(Huy.displayWeeklyPay());

    }
}
