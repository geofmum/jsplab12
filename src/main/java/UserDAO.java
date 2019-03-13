import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> data = new HashMap<String, User>() {{
        put("user", new User("user", "pass", "John Doe"));
        put("demo", new User("demo", "demo", "Jane Doe"));
    }};

    public boolean hasUser(String username, String password) {
        if (data.containsKey(username)) {
            User user = data.get(username);

            return user.getPassword().equals(password);
        } else {
            return false;
        }
    }

    public User getUser(String username) {
        return data.get(username);
    }
}
