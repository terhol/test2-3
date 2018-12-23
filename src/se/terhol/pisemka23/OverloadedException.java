package se.terhol.pisemka23;

/**
 * Electric circuit is overloaded.
 *
 * @author Radek Oslejsek
 */
public class OverloadedException extends ElectricDevicesException {
    public OverloadedException() {
    }

    public OverloadedException(String msg) {
        super(msg);
    }

    public OverloadedException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public OverloadedException(Throwable cause) {
        super(cause);
    }
}
