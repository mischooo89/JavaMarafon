package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
   private String username;
    private List<User> subscriptions;

    public User(String username){
        this.username = username;
        this. subscriptions = new ArrayList<>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        for(User currentUser: subscriptions){
           if (currentUser.getUsername().equals(user.getUsername()));
           return true;
        }
       return false;
    }

    public boolean isFriend(User user){
        for(User currentUser: subscriptions){
            if(this.isSubscribed(user) && user.isSubscribed(currentUser)){
                return true;
            }
            return false;
        }
        return isFriend(user);
    }

    public void sendMessage(User user, String text){
        //TODO
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString(){
         return this.username;
    }
}
