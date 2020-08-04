package app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.With;

@With
@Builder
@AllArgsConstructor
public class User {

    public final String name;
    public final String email;
}
