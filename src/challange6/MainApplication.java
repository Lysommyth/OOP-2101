package challange6;

public class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(156612, "OMORO", "omoroK30@30");

        User curUser = new User(1234, "Marsh");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.


    }

}
