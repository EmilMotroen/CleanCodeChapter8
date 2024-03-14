public class Main {
    public static void main(String[] args) {
        Transmitter transmitter1 = new Transmitter_V1();
        Transmitter transmitter2 = new Transmitter_V2();
        Transmitter transmitter3 = new Transmitter_V3();

        transmitter1.transmit("101.1", transmitter2);
        transmitter2.transmit("202.2", transmitter3);
        transmitter3.transmit("303.3", transmitter1);

    }
}