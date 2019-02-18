import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        Products[] product = new Products[3];
        product[0] = new Products("Samsung", 1000, "Komputer");
        product[1] = new Products("Dr.Oetker", 40, "Pizza");
        product[2] = new Products("Giant", 3000, "Rower");


        FileWriter fileWriter = new FileWriter("text.csv");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write("text.csv");
        bfw.close();


        }
    }

