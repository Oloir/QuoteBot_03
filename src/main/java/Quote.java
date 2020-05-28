import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Quote  {
    ArrayList<String> List1 = new ArrayList<String>();
    Scanner Scan;

    public String getQuote() {

        {
            try {
                Scan = new Scanner(new File("Library"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        {
            while (Scan.hasNextLine()) {
                List1.add(Scan.nextLine());
            }
            String[] array = List1.toArray(new String[0]);

            double z = Math.random() * List1.size();
            int x = (int) Math.round(z);
            System.out.println(z);

            return (List1.get(x));
        }
    }
}
