package Day13;

public class Task1 {
    public static void main(String[] args) {
       User user1 = new User("User1");
       User user2 = new User("User2");
       User user3 = new User("User3");

       user1.sendMessage(user2, "Hello ");
       user1.sendMessage(user2, "how are you?");

       user2.sendMessage(user1, "Hey");
       user2.sendMessage(user1, "I'm fine and you?" );

       user3.sendMessage(user2, "hello friend");
       user3.sendMessage(user2, "let's chill together");

       MessageDatabase.showDialog(user1,user2);


    }
}
