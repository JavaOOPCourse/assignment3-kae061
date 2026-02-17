class ConsultationService extends Service implements Billable {
    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Starting online consultation session.");
        } else {
            System.out.println("Service is not active.");
        }
    }

    @Override
    public void generateBill() {
        System.out.println("Consultation bill generated: $25.");
    }
}