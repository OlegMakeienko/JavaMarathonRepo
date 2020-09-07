package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Oleg");
        User user2 = new User("Max");
        User user3 = new User("Piter");

        user1.sendMessage(user2, "Hello! This is Oleg");
        user1.sendMessage(user2, "How are you? What are you doing now?");

        user2.sendMessage(user1, "Hi!");
        user2.sendMessage(user1, "I'm eating.");

        user3.sendMessage(user2, "Hello!!!! Fuck you!!!");

        user3.sendMessage(user1, "Fuck you!");

        user1.sendMessage(user2, "Are you know that one fucking man send message to me?");
        user1.sendMessage(user3, "Fuck you 2!");

        user2.sendMessage(user1, "Yes, he is stupid!");

    MessageDatebase.showDialog(user1,user3);

        System.out.println();

        MessageDatebase.showDialog(user1,user2);

    }


}
