/*
 * To change this license header, new Capital(choose License Headers in Project Properties.
 * To change this template file, new Capital(choose Tools | Templates
 * and open the template in the editor.
 */
package statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StateCapitals2 {

    public static void main(String[] args) {
        HashMap<String, Capital> capitals = new HashMap<>();
//          Capital myCap = new Capital();

//           Capital capitalOfAlaska = new Capital("Jeaneu");
        capitals.put("Alabama", new Capital("Montgomery"));
        capitals.put("Alaska", new Capital("Juneau"));
        capitals.put("Arizona", new Capital("Phoenix"));
        capitals.put("Arkansas", new Capital("Little Rock"));
        capitals.put("California", new Capital("Sacramento"));
        capitals.put("Colorado", new Capital("Denver"));
        capitals.put("Connecticut", new Capital("Hartford"));
        capitals.put("Delaware", new Capital("Dover"));
        capitals.put("Florida", new Capital("Tallahassee"));
        capitals.put("Georgia", new Capital("Atlanta"));
        capitals.put("Hawaii", new Capital("Honolulu"));
        capitals.put("Idaho", new Capital("Boise"));
        capitals.put("Illinois", new Capital("Springfield"));
        capitals.put("Indiana", new Capital("Indianapolis"));
        capitals.put("Iowa", new Capital("Des Moines"));
        capitals.put("Kansas", new Capital("Topeka"));
        capitals.put("Kentucky", new Capital("Frankfort"));
        capitals.put("Louisiana", new Capital("Baton Rouge"));
        capitals.put("Maine", new Capital("Augusta"));
        capitals.put("Maryland", new Capital("Annapolis"));
        capitals.put("Massachusetts", new Capital("Boston"));
        capitals.put("Michigan", new Capital("Lansing"));
        capitals.put("Minnesota", new Capital("Saint Paul"));
        capitals.put("Mississippi", new Capital("Jackson"));
        capitals.put("Missouri", new Capital("Jefferson City"));
        capitals.put("Montana", new Capital("Helena"));
        capitals.put("Nebraska", new Capital("Lincoln"));
        capitals.put("Nevada", new Capital("Carson City"));
        capitals.put("New Hampshire", new Capital("Concord"));
        capitals.put("New Jersey", new Capital("Trenton"));
        capitals.put("New Mexico", new Capital("Santa Fe"));
        capitals.put("New York", new Capital("Albany"));
        capitals.put("North Carolina", new Capital("Raleigh"));
        capitals.put("North Dakota", new Capital("Bismarck"));
        capitals.put("Ohio", new Capital("Columbus"));
        capitals.put("Oklahoma", new Capital("Oklahoma City"));
        capitals.put("Oregon", new Capital("Salem"));
        capitals.put("Pennsylvania", new Capital("Harrisburg"));
        capitals.put("Rhode Island", new Capital("Providence"));
        capitals.put("South Carolina", new Capital("Columbia"));
        capitals.put("South Dakota", new Capital("Pierre"));
        capitals.put("Tennessee", new Capital("Nashville"));
        capitals.put("Texas", new Capital("Austin"));
        capitals.put("Utah", new Capital("Salt Lake City"));
        capitals.put("Vermont", new Capital("Montpelier"));
        capitals.put("Virginia", new Capital("Richmond"));
        capitals.put("Washington", new Capital("Olympia"));
        capitals.put("West Virginia", new Capital("Charleston"));
        capitals.put("Wisconsin", new Capital("Madison"));
        capitals.put("Wyoming", new Capital("Cheyenne"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a minimum population : ");

        int m = sc.nextInt();
        int i = 0;

        System.out.println("Map size is: " + capitals.size());

        Collection<Capital> capValues = capitals.values();
        Collection<String> keyValues = capitals.keySet();

        for (String state : keyValues) {
            System.out.println(state);
        }
        System.out.println();
        for (Capital p : capValues) {
            System.out.println(p);

        }
        System.out.println();
        for (String state : keyValues) {
            Capital curCapital = capitals.get(state);
            System.out.println(state + ":" + curCapital.getName() + "|" + curCapital.getPop() + "|" + curCapital.getArea() + " square miles.");
        }

        System.out.println();
        for (String state : keyValues) {

            Capital curCapital = capitals.get(state);

            if (curCapital.getPop() > m) {
                System.out.println(state + ":" + curCapital.getName() + "|" + curCapital.getPop());
            } else {

            }
        }

    }
}
