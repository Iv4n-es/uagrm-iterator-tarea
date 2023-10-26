package bo.edu.uagrm.soe.iterator.conPatronIterator;

public class GoogleApi implements Aggregate {

    @Override
    public Iterator<GoogleUser> createIterator() {
        return new GoogleUserIterator(getGoogleUsers());
    }
    public GoogleUser[] getGoogleUsers() {
        var users = new GoogleUser[3];
        users[0] = new GoogleUser("ivan", "ivan@gmail.com");
        users[1] = new GoogleUser("diego", "diego@gmail.com");
        users[2] = new GoogleUser("veronica", "veronica@gmail.com");
        return users;
    }
}