package se.terhol.pisemka23;

/**
 * Root of the exceptions tree for this project.
 *
 * @author Radek Oslejsek
 */
public class ElectricDevicesException extends Exception {
    public ElectricDevicesException() {
    }

    public ElectricDevicesException(String msg) {
        super(msg);
    }

    public ElectricDevicesException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ElectricDevicesException(Throwable cause) {
        super(cause);
    }
}
