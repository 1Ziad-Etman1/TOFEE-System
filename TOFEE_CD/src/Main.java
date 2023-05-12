/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Managment_System m = new Managment_System();
//        m.Interface();

//        Payment_System p = new Payment_System(3);
//        p.setCash(3);
//        System.out.println(p.getPayWays().get(0));
//        System.out.println(p.getPayWays().get(2));
        ID_Generator d = new ID_Generator();
        System.out.println(d.current_label_item());
//        Connect c = new Connect("Items");
//        c.insertInAuthTable();
//        c.search_viewByCategory("Gummies");
//        m.searchCategory("Gummies");
    }
//id	name	username	email	password	phoneNum	address	type
//u1	Ziad	Z-Etman	engziad90@gmail.com	11223344	01533252626	Giza-Cairo	client
    //Z-Etman engziad90@gmail.com 11223344 1 u1 giza i3 2 1 i5 1 2 1000 11.969999



}