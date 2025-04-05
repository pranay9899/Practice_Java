package _15_interfaces;

/**
 * Interface with a default method.
 */
interface Camera {
    void takePhoto();

    // Default method with a body (Java 8+)
    default void recordVideo() {
        System.out.println("Recording video in 1080p...");
    }
}

/**
 * Class implementing the Camera interface.
 */
class Phone implements Camera {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with 64MP camera...");
    }

    // Optionally override the default method
    @Override
    public void recordVideo() {
        System.out.println("Recording video in 4K from Phone...");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Camera cam = new Phone();
        cam.takePhoto();
        cam.recordVideo(); // calls overridden method
    }
}
