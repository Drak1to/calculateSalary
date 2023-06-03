package Salary;

public class Work implements Interface{
    public double money;
    public int hour;

    public Work(double money, int hour) {
        this.money = money;
        this.hour = hour;
    }

    @Override
    public double salary() {
        return money * hour ;
    }

    public double getMoney() {
        return money;
    }

    public int getHour() {
        return hour;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Work{" +
                "money=" + money +
                ", hour=" + hour +
                '}';
    }
}
