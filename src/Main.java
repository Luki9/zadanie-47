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

        File file = new File("text.csv");

        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        try {
            Scanner scanner2 = new Scanner(file);
            if (scanner.hasNextLine()) {
                String nextline = scanner.nextLine();
                System.out.println(nextline);
            }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();

        }





        }

        
    }

