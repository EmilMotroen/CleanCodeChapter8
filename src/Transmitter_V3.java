public class Transmitter_V3 implements Transmitter{
    @Override
    public void transmit(String frequency, Transmitter transmitter) {
        System.out.println("Transmitter_V3 is transmitting on frequency: " +
                frequency + " with " + transmitter.getClass().getSimpleName());
    }
}