public class StreamingService extends Service
        implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String name, int id) {
        super(name, id);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (isActive()) {
            if (isPremium) {
                System.out.println("Streaming in 4K Ultra HD.");
            } else {
                System.out.println("Streaming in standard quality.");
            }
        } else {
            System.out.println("Service is not active.");
        }
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Streaming service upgraded to Premium");
    }
}