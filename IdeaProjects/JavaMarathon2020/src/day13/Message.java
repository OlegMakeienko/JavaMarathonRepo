package day13;

import java.util.Date;

public class Message {
    private User receiver;
    private User sender;
    private String text;
    private Date date;

    public Message(User receiver, User sender, String text) {
        this.receiver = receiver;
        this.sender = sender;
        this.text = text;
        this.date = new Date();
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\nTO: "+ receiver
                + "\n ON: " + date +  "\n" + text + "\n";
    }
}

