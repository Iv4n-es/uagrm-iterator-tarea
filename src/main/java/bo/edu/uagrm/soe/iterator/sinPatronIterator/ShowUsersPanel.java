package bo.edu.uagrm.soe.iterator.sinPatronIterator;

public class ShowUsersPanel {

    private final GoogleApi googleApi;
    private final FacebookApi facebookApi;

    public ShowUsersPanel() {
        this.googleApi = new GoogleApi();
        this.facebookApi = new FacebookApi();
    }

    public void show() {
        var users = this.googleApi.getGoogleUsers();
        for (var i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        var fbUsers = this.facebookApi.getFacebookUsers();
        for (var i = 0; i < fbUsers.size(); i++) {
            System.out.println(fbUsers.get(i));
        }
    }
}

