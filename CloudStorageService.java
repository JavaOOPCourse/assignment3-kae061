class CloudStorageService extends Service implements PremiumFeature, Billable {
    private boolean isPremium;
    private int storageUsed;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
        this.storageUsed = 50;
    }

    @Override
    public void performService() {
        if (isActive()) {
            System.out.println("Storing files... Used  space: " + storageUsed + "GB");
        } else {
            System.out.println("Service is not active.");
        }
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Cloud storage upgraded to Premium (more storage available).");
    }

    @Override
    public void generateBill() {
        System.out.println("Cloud storage bill generated: $10.");
    }
}