package bo.edu.uagrm.soe.iterator.conPatronIterator;

import java.util.List;
public class FacebookApi implements Aggregate{

    @Override
    public Iterator<FacebookUser> createIterator() {
        return new FacebookUserIterator(getFacebookUsers());
    }

    public List<FacebookUser> getFacebookUsers() {
        return List.of(
                new FacebookUser("ivan", "enlace1"),
                new FacebookUser("veronica", "enlace2"),
                new FacebookUser("diego", "enlace3")
        );
    }
}