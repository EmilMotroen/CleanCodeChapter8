public class FakeTransmitter implements Transmitter {
    @Override
    public void transmit(String frequency, Transmitter transmitter) {
        System.out.println("FakeTransmitter is transmitting on frequency: " +
                frequency + " with " + transmitter.getClass().getSimpleName());
    }
}
