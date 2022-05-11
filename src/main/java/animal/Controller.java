package animal;

import animal.input.DataJSON;
import animal.input.Record;
import animal.output.Show;
import animal.output.ShowInConsole;

public class Controller {
    public static void main(String[] args) {
        //Getting data from storage
        Record record = new DataJSON();
        long count = 0;
        try {
            count = record.getData();
        } catch (Exception e) {
            System.out.println("Error, maybe you entered incorrect data!");
        }
        //Showing data into any viewer
        Show show = new ShowInConsole();
        show.showData(count);
    }

}
