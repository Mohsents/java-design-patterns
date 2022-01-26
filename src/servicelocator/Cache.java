package servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private final List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public void addService(Service newService) {
        if (!services.contains(newService)) {
            services.add(newService);
        }
    }

    public Service getService(Services service) {
        for (Service s : services) {
            if (s.getName().equalsIgnoreCase(service.name())) {
                System.out.println("Returning cached service: " + s.getName());
                return s;
            }
        }
        return null;
    }
}
