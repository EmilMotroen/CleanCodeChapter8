public class Main {
    public static void main(String[] args) {
        Transmitter transmitter_v1 = new FakeTransmitter();
        Transmitter transmitter_v2 = new FakeTransmitter();

        transmitter_v1.transmit("5.200.55", "input");
        transmitter_v2.transmit("78.12.02", "output");


    }
}