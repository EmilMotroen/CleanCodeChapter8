public class Transmitter_V1 implements Transmitter{
    @Override
    public void transmit(String frequency, Transmitter transmitter) {
        System.out.println("Transmitter_V1 is transmitting on frequency: " +
                frequency + " with " + transmitter.getClass().getSimpleName());
    }
}
