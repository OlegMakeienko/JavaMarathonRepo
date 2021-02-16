import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(1);
            myLinkedList.add(2);
            myLinkedList.add(10);
            myLinkedList.add(4);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));

        myLinkedList.remove(2);
        System.out.println(myLinkedList);

    }
}
