package producer.speed;

import myosgi.service.SpeedService;
import org.osgi.framework.*;

public class SpeedActivator implements BundleActivator {
    private ServiceRegistration<SpeedService> registration;

    public void start(BundleContext context) {
        SpeedService service = () -> (Math.random() * 100) + " km/h";
        registration = context.registerService(SpeedService.class, service, null);
        System.out.println("🚗 Speed Sensor Activated");
    }

    public void stop(BundleContext context) {
        registration.unregister();
        System.out.println("🚗 Speed Sensor Stopped");
    }
}