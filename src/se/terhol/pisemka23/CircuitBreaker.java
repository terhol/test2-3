package se.terhol.pisemka23;

public class CircuitBreaker implements ICircuitBreaker {
    private int maxPower;
    private ElectricDevice[] devices;
    private boolean isOn = false;

    /**
     * Initially the breaker is switched off.
     *
     * @param maxPower maximal allowed electric power, must be bigger than zero
     * @param devices  array of devices, must not be null
     * @throws IllegalArgumentException if maxPower is <= 0 or devices is null
     */
    public CircuitBreaker(int maxPower, ElectricDevice[] devices) {
        if (maxPower <= 0) {
            throw new IllegalArgumentException("maxPower");
        }
        if (devices == null) {
            throw new IllegalArgumentException("devices");
        }
        this.maxPower = maxPower;
        this.devices = devices;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @override
    public void switchAndTest() throws OverloadedException {
        // TO DO
    }
}
