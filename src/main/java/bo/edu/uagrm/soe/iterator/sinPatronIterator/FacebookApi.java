package bo.edu.uagrm.soe.iterator.sinPatronIterator;

import java.util.List;
public class FacebookApi {

    public List<FacebookUser> getFacebookUsers() {
        return List.of(
                new FacebookUser("ivan", "enlace1"),
                new FacebookUser("veronica", "enlace2"),
                new FacebookUser("diego", "enlace3")
        );
    }
}