import dao.GenericDAO;
import domain.UserDAO;
import domain.UserDomain;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static GenericDAO<Integer, UserDomain> dao = new UserDAO();

    public static void main(String[] args) {

        var user = new UserDomain(1, "João", 20);

        System.out.println(dao.count());
        System.out.println(dao.save(user));
        System.out.println(dao.findAll());
        System.out.println(dao.find(d -> d.getId().equals(1)));
        System.out.println(dao.find(d -> d.getId().equals(2)));
        System.out.println(dao.count());
        System.out.println(dao.delete(new UserDomain(-1, "", -1)));
        System.out.println(dao.delete(user));
        System.out.println(dao.findAll());
        System.out.println(dao.count());

    }


}