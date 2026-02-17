abstract class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public abstract void manageService(Service s);

    public abstract void useService(Service s);
}