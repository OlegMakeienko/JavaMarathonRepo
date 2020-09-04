package day11;

public class Picker implements Worker {
    int salary;
    private Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork(){
        this.salary+=80;
        w.setCountOrder(w.getCountOrder()+1);


    }
    @Override
    public void bonus() {
        if(w.getCountOrder()>1500) {
            salary*=3;
        }

    }

    @Override
    public String toString() {
        return "Picker{" +
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
