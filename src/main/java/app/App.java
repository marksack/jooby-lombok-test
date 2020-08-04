package app;

import io.jooby.Jooby;
import io.jooby.di.GuiceModule;

public class App extends Jooby {

  {

    install(new GuiceModule());
    mvc(new Controller());
    mvc(UserController.class);
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
