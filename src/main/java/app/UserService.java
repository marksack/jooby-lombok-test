package app;

public class UserService {

    public User save() {
        return User.builder().build().withEmail("test@example.com");
    }
}
