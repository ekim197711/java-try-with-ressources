public class SomethingWeWantToClose implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Now Im closing the connection to something important...");
    }
}
