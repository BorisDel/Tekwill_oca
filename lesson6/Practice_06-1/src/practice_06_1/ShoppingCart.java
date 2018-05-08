public class ShoppingCart {
    public static int main(String[] args) {
        //Item item1, item2;
        item1 = new Item();
        item2 = new Item();

        item1.desc = "description 1";
        item2.desc = "description 1";

        item1 = item2;
        System.out.println(item1.desc);
        System.out.println(item2.desc);

    }
}
