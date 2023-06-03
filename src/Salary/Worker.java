package Salary;

public class Worker implements Interface{
    public static double monthMoney = 25000;

    public Worker() {
    }
    @Override
    public  double salary() {
        return monthMoney ;
    }

    public static double getMonthMoney() {
        return monthMoney;
    }

    public static void setMonthMoney(double monthMoney) {
        Worker.monthMoney = monthMoney;
    }

}
