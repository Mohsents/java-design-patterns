package servicelocator;

public class ServiceLocator {
    private static final Cache cache;
    static {
        cache = new Cache();
    }

    public static Service getService(Services service) {
        Service cachedService = cache.getService(service);
        if (cachedService != null) {
            return cachedService;
        }

        InitialContext initialContext = new InitialContext();
        Service newService = initialContext.lookup(service);
        cache.addService(newService);
        return newService;
    }
}
