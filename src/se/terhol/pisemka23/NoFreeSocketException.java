package se.terhol.pisemka23;

/**
 * This exception is used if there is not free socket available for
 * addition electric devices.
 *
 * @author Radek Oslejsek
 */
public class NoFreeSocketException extends ElectricDevicesException {
    public NoFreeSocketException() {
    }

    public NoFreeSocketException(String msg) {
        super(msg);
    }

    public NoFreeSocketException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NoFreeSocketException(Throwable cause) {
        super(cause);
    }
}
