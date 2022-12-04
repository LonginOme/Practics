import java.util.Scanner;
public class Seasons {
    public enum seasons {
        Winter(-20, "Cold season"),
        Spring(16, "Warm season"),
        Summer(25, "Warm season"),
        Autumn(10, "Cold season"),
        ;
        private final int avtemp;
        private final String Description;
        public String getDescription () {
            return this.Description;
        }
        public int getavtemp () {
            return this.avtemp;
        }
        private seasons (int avtemp, String Description) {
            this.avtemp = avtemp;
            this.Description = Description;
        }
    }
    public static void main(String[] args) {
        seasons fav = seasons.Winter;
        System.out.println(fav);
        for (seasons level : seasons.values()) {
            System.out.println(level);
        }
        seasons out = seasons.Winter;
        System.out.println (out.getDescription());
        switch (fav) {
            case Winter: System.out.println("I love winter"); break;
            case Spring: System.out.println("I love spring"); break;
            case Summer: System.out.println("I love summer"); break;
            case Autumn: System.out.println("I love autumn"); break;
        }
    }
}
