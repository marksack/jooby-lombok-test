package app;

import io.jooby.annotations.GET;
import io.jooby.annotations.POST;
import io.jooby.annotations.Path;

import javax.inject.Inject;
import java.util.Optional;

@Path("users/")
public class UserController {

    private final UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    public User save(User userToSave) {
        return userService.save();
    }
}
