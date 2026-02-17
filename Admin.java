class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin managing: " + s.getServiceName());
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin using service:");
        s.performService();
    }
}