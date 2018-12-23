package se.terhol.pisemka23;

/**
 * Electric circuit with given number of sockets enabling to plug
 * electric devices. Breaker associated with the circuit
 * protects the circuit against the overload.
 *
 * @author Radek Oslejsek
 * @version 2010-11-30
 */
public interface ICircuit {
    /**
     * @return breaker protecting the circuit
     */
    CircuitBreaker getBreaker();

    /**
     * Determines whether the given device is connected to the circuit.
     *
     * @param device electric device to check
     * @return index of socket the device is connected to,
     * -1 on error (the device is null or is not connected to this circuit)
     */
    int isConnected(ElectricDevice device);

    /**
     * @return index of a free socket, -1 if there is no free socket
     */
    int getFreeSocket();

    /**
     * Connects device to a free socket and invokes the breaker's switchAndTest
     * method to protect the circuit from overload (connecting a switched on device
     * can cause the overload).
     *
     * @param device electric device to be connected
     * @throws NoFreeSocketException   if there is no free socket in the circuit
     * @throws OverloadedException     if the device caused overload
     * @throws IlegalArgumentException if the given device is already connected
     *                                 to the circuit.
     */
    void connect(ElectricDevice device)
            throws NoFreeSocketException, OverloadedException;

    /**
     * Disconnects device from the circuit.
     *
     * @param device electric device to be disconnected
     * @throws IlegalArgumentException if the given device is not connected
     *                                 to the circuit
     */
    void disconnect(ElectricDevice device);
}
