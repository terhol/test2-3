package se.terhol.pisemka23;

/**
 * @author Tereza Holm
 */
public class Circuit implements ICircuit {
    private int numSockets;
    private int maxPower;
    private ElectricDevice[] connectedDevices;

    public Circuit(int numSockets, int maxPower) {
        if (numSockets <= 0 || maxPower <= 0) {
            throw new IllegalArgumentException();
        }
        this.numSockets = numSockets;
        this.maxPower = maxPower;
        connectedDevices = new ElectricDevice[numSockets];
    }

    @Override
    public CircuitBreaker getBreaker() {
        return new CircuitBreaker(maxPower, connectedDevices);
    }

    @Override
    public int isConnected(ElectricDevice device) {
        int isConnected = -1;
        for (int i = 0; i < numSockets; i++) {
            if (device.equals(connectedDevices[i])) {
                isConnected = i;
            }
        }
        return isConnected;
    }

    @Override
    public int getFreeSocket() {
        int freeSocket = -1;
        for (int i = 0; i < numSockets; i++) {
            if (connectedDevices[i] == null) {
                freeSocket = i;
                break;
            }
        }
        return freeSocket;
    }

    @Override
    public void connect(ElectricDevice device) throws NoFreeSocketException, OverloadedException {
        if (isConnected(device) > -1) {
            throw new IllegalArgumentException();
        }
        if (getFreeSocket() == -1) {
            throw new NoFreeSocketException();
        }
        int freeSocket = getFreeSocket();
        connectedDevices[freeSocket] = device;
        getBreaker().switchAndTest();
    }

    @Override
    public void disconnect(ElectricDevice device) {
        if (isConnected(device) == -1) {
            throw new IllegalArgumentException();
        }
        int numberOfSocket = isConnected(device);
        connectedDevices[numberOfSocket] = null;
    }
}
