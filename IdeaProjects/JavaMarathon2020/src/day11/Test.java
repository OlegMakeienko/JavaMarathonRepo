package day11;

public class Test {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        Picker picker = new Picker(w);
        Courier courier = new Courier (w);
        picker.doWork();
        courier.doWork();
        System.out.println(w + " " + picker + " " + courier);

        for (int i=1;i<=1500;i++){
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(w + " " + picker + " " + courier);


    }
}
