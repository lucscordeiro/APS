public class App {
    public static void main(String[] args) throws Exception {
        Account p1 = new Account();
        p1.setNumAccount(1111.f);
        p1.setOwner("Jubileu");
        p1.openAccount("CC");
        p1.deposit(100.f);
        p1.withdraw(150.f);
        p1.closeAccount();

        Account p2 = new Account();
        p2.setNumAccount(2222.f);
        p2.setOwner("Creuza");
        p2.openAccount("CP");
        p2.deposit(500.f);
        p2.withdraw(100.f);

        p1.show();
        p2.show();
    }
}
