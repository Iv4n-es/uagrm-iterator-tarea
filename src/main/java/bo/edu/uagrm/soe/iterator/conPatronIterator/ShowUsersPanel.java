package bo.edu.uagrm.soe.iterator.conPatronIterator;

public class ShowUsersPanel {

    private final GoogleApi googleApi;
    private final FacebookApi facebookApi;

    public ShowUsersPanel() {
        this.googleApi = new GoogleApi();
        this.facebookApi = new FacebookApi();
    }

    public void show() {
        Iterator<GoogleUser> googleIterator = googleApi.createIterator();
        while (!googleIterator.isDone()) {
            System.out.println(googleIterator.next());
        }

        Iterator<FacebookUser> fbIterator = facebookApi.createIterator();
        while (!fbIterator.isDone()) {
            System.out.println(fbIterator.next());
        }
    }

}

