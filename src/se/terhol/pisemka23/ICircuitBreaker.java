package se.terhol.pisemka23;

/**
 * Electric breaker, i.e. the equipment that switches off electric power
 * whenever the circuit is overloaded.
 *
 * @author Radek Oslejsek
 */
public interface ICircuitBreaker {
    /**
     * Determines wheter the breaker is on (there is a power in a circuit) or off.
     *
     * @return true if the breaker is on, false otherwise
     */
    boolean isOn();

    /**
     * This method is to be called periodically and works as follows:<br/>
     * <ul>
     * <li>It computes the overall power as the sum of powers of all
     * connected devices THAT ARE SWITCHED ON (i.e. the only devices actually
     * consuming power are taken into consideration).</li>
     * <li>If there is an overload then the breaker is switched off and exception is
     * thrown. If no overload is detected then the breaker is switched on.</li>
     * </ul>
     *
     * @param devices electric devices
     * @throws OverloadedException if the overload is detected
     */
    void switchAndTest() throws OverloadedException;
}
