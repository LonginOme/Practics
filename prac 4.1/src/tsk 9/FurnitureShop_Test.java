package task9;
public class FurnitureShop_Test {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(2);
        shop.add(new Wardrobe(
                "Гардероб для прихожей", 2, 1, 1, 11250, "Металл+Дуб", 3, 7));
        shop.add(new Table(
                "Стол", 1.2, 1.2, 1, 6150, "Сосна", 2));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(3));
        System.out.println(shop.getPrices());
    }
}
