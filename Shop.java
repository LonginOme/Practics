import java.util.Scanner;
public class Shop {
    static Comp[] mas = new Comp[999];

    public static void main(String[] args) {
        int menu = 0;
        int counter = -1;

        while (menu != 3) {
            Scanner scan = new Scanner(System.in);
            if (menu == 0) {
                System.out.println("\nMenu:");
                System.out.println("1 - add comp");
                System.out.println("2 - search");
                System.out.println("3 - exit");
                menu = scan.nextInt();
                System.out.println("-----------------");

                if (menu == 1) {
                    ++counter;
                    System.out.println("Enter name, prise, year");
                    Scanner scan1 = new Scanner(System.in);
                    mas[counter] = new Comp(scan1.next(), scan1.nextDouble(), scan1.nextInt());
                    menu =0;
                }

                if (menu == 2) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Enter comp name: ");
                    String cn = scan2.nextLine();
                    for (int i = 0; i < 999; i++) {
                        if (mas[i].getName().equals(cn)) {
                            System.out.println("Year: " + mas[i].getYear());
                            System.out.println("Price: " + mas[i].getPrice());
                            break;
                        }
                    }
                    menu=0;
                }

                if (menu == 3) {
                    break;
                }
            }
        }
    }

    public static class Comp {
        private String name;
        private double price;
        private int year;

        public Comp(String name, double price, int year) {
            this.name = name;
            this.price = price;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}