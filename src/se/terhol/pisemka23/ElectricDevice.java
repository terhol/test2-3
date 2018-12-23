package se.terhol.pisemka23;

/**
 * Electric device.
 *
 * @author Radek Oslejsek
 * @version 2010-11-30
 */
public class ElectricDevice {
    private double power;
    private boolean isOn = false;
    private String id;

    /**
     * Initially, the new electric device is switched off.
     *
     * @param id    unique ID of the device
     * @param power electric power, must be bigger that 0
     * @throws IlleagArgumentException if the power argument is <= 0
     * @throws IlleagArgumentException if ID is null
     */
    public ElectricDevice(String id, double power) {
        if (id == null) {
            throw new IllegalArgumentException("id");
        }
        if (power <= 0) {
            throw new IllegalArgumentException("power");
        }
        this.power = power;
        this.id = id;
    }

    /**
     * @return true if the electric device is on, false otherwise
     */
    public boolean isOn() {
        return isOn;
    }

    /**
     * Switches the electric device off.
     */
    public void switchOff() {
        isOn = false;
    }

    /**
     * Switches the electric device on.
     */
    public void switchOn() {
        isOn = true;
    }

    /**
     * @return electric power consumed by the device
     */
    public double getPower() {
        return power;
    }
}
