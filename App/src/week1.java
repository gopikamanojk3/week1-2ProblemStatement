import java.util.*;

class UsernameChecker {

    HashMap<String, Integer> users = new HashMap<>();
    HashMap<String, Integer> attempts = new HashMap<>();

    boolean checkAvailability(String username) {
        attempts.put(username, attempts.getOrDefault(username, 0) + 1);
        return !users.containsKey(username);
    }

    void register(String username, int id) {
        if (checkAvailability(username)) {
            users.put(username, id);
        }
    }

    List<String> suggest(String username) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=3;i++){
            list.add(username + i);
        }
        list.add(username.replace("_","."));
        return list;
    }
}