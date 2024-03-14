public class Transmitter_V2 implements Transmitter{
    @Override
    public void transmit(String frequency, Transmitter transmitter) {
        System.out.println("Transmitter_V2 is transmitting on frequency: " +
                frequency + " with " + transmitter.getClass().getSimpleName());
    }
}
