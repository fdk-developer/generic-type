import dao.GenericDAO;
import domain.UserDAO;
import domain.UserDomain;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static GenericDAO<UserDomain> dao = new UserDAO();

    public static void main(String[] args) {

        var user = new UserDomain("João", 20);

        System.out.println(dao.count());
        System.out.println(dao.save(user));
        System.out.println(dao.findAll());
        System.out.println(dao.count());
        System.out.println(dao.delete(new UserDomain("", -1)));
        System.out.println(dao.delete(user));
        System.out.println(dao.findAll());
        System.out.println(dao.count());

    }


}