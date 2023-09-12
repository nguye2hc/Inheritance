public class WorkerTest {
    public static void main(String[] args) {

    Worker Huy = new Worker("123456", "Huy", "Nguyen", "Worker", 2004, 45);
    Huy.setFirstName("Huy");

    System.out.println(Huy);

    System.out.println(Huy.calculateWeeklyPay(40));

    System.out.println(Huy.displayWeeklyPay());

}
}

