
import java.util.ArrayList;

class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }

    public void addFriend(int friendId) {
        if (!friendIds.contains(friendId)) {
            friendIds.add(friendId);
        }
    }
}

class SocialMedia {
    private User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public User getUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = getUserById(userId1);
        User user2 = getUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }

    public void displayFriends(int userId) {
        User user = getUserById(userId);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.println(user.name + "'s Friends:");
        if (user.friendIds.isEmpty()) {
            System.out.println("No friends added.");
        } else {
            for (int friendId : user.friendIds) {
                User friend = getUserById(friendId);
                if (friend != null) {
                    System.out.println(friend.name + " (ID: " + friend.userId + ")");
                }
            }
        }
    }
}

public class SocialMediaFriends {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

      
        socialMedia.addUser(1, "gaurav", 25);
        socialMedia.addUser(2, "guzzar", 22);
        socialMedia.addUser(3, "shks", 28);
        socialMedia.addUser(4, "sds", 24);

    
        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);
        socialMedia.addFriendConnection(2, 4);

       
        System.out.println("\n=== Friends List ===");
        socialMedia.displayFriends(1);
        socialMedia.displayFriends(2);
    }
}