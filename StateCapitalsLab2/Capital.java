/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statecapitals;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Capital{

    private String name;
    private int population;
    private int area;
    Random r = new Random();

    public Capital(String nameIn) {
        name = nameIn;
        population = r.nextInt(1000000);
        area = r.nextInt(100000);
//        population = r.nextInt();
    }

    public Capital(String nameIn, int populationIn, int areaIn) {
        name = nameIn;
        population = populationIn;
        area = areaIn;
    }

    public String getName() {
        return this.name;
    }

    public int getPop() {
        return this.population;
    }

    public int getArea() {
        return this.area;
    }


}

