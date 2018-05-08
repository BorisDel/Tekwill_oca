package Practice5_3;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String message;

        String[] items = new String [4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Schirt";

        message = custName + "wants to purchase" + items.length + "items";
        System.out.println(message);

        System.out.println("Items purchased :");
        for (String item: items ) {
            System.out.print(item + ", ");
        }

        for (String item : items) {
            System.out.print(items);

        }

        for(int i=0; i < items.length; i++) {
            if(i%2 ==1)
                System.out.println(items[i] + ",");
        }
    }}
