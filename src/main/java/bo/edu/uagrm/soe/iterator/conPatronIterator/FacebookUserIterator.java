package bo.edu.uagrm.soe.iterator.conPatronIterator;

import java.util.List;

public class FacebookUserIterator implements Iterator<FacebookUser> {
    private final List<FacebookUser> users;
    private int index = 0;

    public FacebookUserIterator(List<FacebookUser> users) {
        this.users = users;
    }

    @Override
    public FacebookUser next() {
        if (isDone()) {
            return null;
        }
        return users.get(index++);
    }

    @Override
    public boolean isDone() {
        return index >= users.size();
    }
}
