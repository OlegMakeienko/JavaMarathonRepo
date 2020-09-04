package day11;

public class Courier implements Worker {
    int salary;
    private Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public void doWork() {
        this.salary+=100;
        w.setBalance(w.getBalance()+1000);
    }

    @Override
    public void bonus() {
        if(w.getBalance()>=1000000){
            salary*=2;
        }

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
