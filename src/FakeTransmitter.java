public class FakeTransmitter implements Transmitter {
    @Override
    public void transmit(String frequency, String stream) {
        System.out.println("Frequency: " + frequency + " on stream: " + stream);
    }
}
