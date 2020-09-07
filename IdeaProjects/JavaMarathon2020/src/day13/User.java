package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscription;

    public User(String username) {
        this.username = username;
        this.subscription = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscription.add(user);
    }

    public boolean isSubscribe(User user){
        for (User otherUser : subscription) {
            if (otherUser.getName().equals(user.getName()))
            return true;
        }
        return false;
    }

    public boolean isFriend(User user){
       return this.isSubscribe(user) && user.isSubscribe(this);
    }

    public void sendMessage (User user, String text) {
        MessageDatebase.addNewMessage(this, user, text);
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public void setSubscription(List<User> subscription) {
        this.subscription = subscription;
    }

    public String toString () {
        return username;
    }



}
