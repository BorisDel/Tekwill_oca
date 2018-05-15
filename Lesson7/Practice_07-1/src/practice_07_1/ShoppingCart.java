/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_07_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        String lastName;
        int spaceIdx;

                spaceIdx = custName.indexOf(" ");

        firstName = custName.substring(0, spaceIdx);
        lastName = custName.substring(spaceIdx +1 );
        System.out.println("("+firstName+')');
        System.out.print(firstName);
        System.out.print(firstName);
        System.out.println();
        System.out.println(lastName + "22");

        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" Smith");
        sb.append(" Dukalis");
        sb.append(" is Great ~!!");
        //sb.append(custName.substring(spaceIdx));
        System.out.println(sb);

    }
}