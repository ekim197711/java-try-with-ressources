import javax.management.relation.RoleUnresolved;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryResourceDemo {
    public static void main(String[] args) {
//        try(PrintWriter printWriter =  new PrintWriter(new File("mytestfile1.txt"))) {
//             printWriter.write("Test 1 2 3 \n");
//             printWriter.write("Test 1 2 3 \n");
//             printWriter.write("Test 1 2 3 \n");
//             printWriter.write("Test 1 2 3 \n");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try(SomethingWeWantToClose s = new SomethingWeWantToClose()){
            System.out.println("Do something");
            if (true)
                throw new RuntimeException("Wopsi dopsi");
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
