import dao.ClientDAO;
import dao.GenericDAO;
import dao.UserDAO;
import domain.ClientDomain;
import domain.UserDomain;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static GenericDAO<Integer, UserDomain> userDao = new UserDAO();
    private final static GenericDAO<String, ClientDomain> clientDao = new ClientDAO();

    public static void main(String[] args) {

        System.out.println("===inicioUserDAO===");
        var user = new UserDomain(1, "João", 20);
        System.out.println(userDao.count());
        System.out.println(userDao.save(user));
        System.out.println(userDao.findAll());
        System.out.println(userDao.find(d -> d.getId().equals(1)));
        System.out.println(userDao.find(d -> d.getId().equals(2)));
        System.out.println(userDao.count());
        System.out.println(userDao.delete(new UserDomain(-1, "", -1)));
        System.out.println(userDao.delete(user));
        System.out.println(userDao.findAll());
        System.out.println(userDao.count());
        System.out.println("===fimUserDAO===");

        System.out.println("===inicioClientDAO===");
        var client = new ClientDomain("A", "Maria", 21);
        System.out.println(clientDao.count());
        System.out.println(clientDao.save(client));
        System.out.println(clientDao.findAll());
        System.out.println(clientDao.find(d -> d.getId().equals("A")));
        System.out.println(clientDao.find(d -> d.getId().equals("2")));
        System.out.println(clientDao.count());
        System.out.println(clientDao.delete(new ClientDomain("", "", -1)));
        System.out.println(clientDao.delete(client));
        System.out.println(clientDao.findAll());
        System.out.println(clientDao.count());
        System.out.println("===fimClientDAO===");

    }


}