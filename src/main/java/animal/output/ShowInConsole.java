package animal.output;


public class ShowInConsole implements Show {
    @Override
    public void showData(long count) {
        System.out.println("count of legs: " + count);
    }
}
