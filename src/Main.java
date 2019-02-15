import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {

        Products[] product = new Products[3];
        product[0] = new Products("Samsung", 1000,"Komputer");
        product[1] = new Products("Dr.Oetker",40,"pizza");
        product[2] = new Products("Giant", 3000,"Rower");

        FileWriter fileWriter = new FileWriter("item.csv");
        BufferedWriter bfr = new BufferedWriter(fileWriter);
        

    }
}
