package bo.edu.uagrm.soe.iterator.conPatronIterator;

public class GoogleUserIterator implements Iterator<GoogleUser> {
    private final GoogleUser[] users;
    private int index = 0;

    public GoogleUserIterator(GoogleUser[] users) {
        this.users = users;
    }

    @Override
    public GoogleUser next() {
        if (isDone()) {
            return null;
        }
        return users[index++];
    }

    @Override
    public boolean isDone() {
        return index >= users.length;
    }
}
