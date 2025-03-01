package myosgi.speedmonitor;

import myosgi.service.SpeedService;
import org.osgi.framework.*;

public class SpeedMonitorActivator implements BundleActivator {
    public void start(BundleContext context) {
        ServiceReference<SpeedService> reference = context.getServiceReference(SpeedService.class);
        if (reference != null) {
            SpeedService service = context.getService(reference);
            System.out.println("🚦 Speed Monitor: Current Speed - " + service.getSpeed());
        }
    }

    public void stop(BundleContext context) {
        System.out.println("🚦 Speed Monitor Stopped");
    }
}