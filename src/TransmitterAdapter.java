public class TransmitterAdapter implements Transmitter {
    public void transmit(String frequency, Transmitter transmitter) {
        System.out.println("TransmitterAdapter is transmitting on frequency: " +
                frequency + " with " + transmitter.getClass().getSimpleName());
    }
}
