/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.exampletwo;

import th.geniustree.intership.exampleone.Car;
import th.geniustree.intership.exampleone.Xcar;

/**
 *
 * @author oom
 */
public class Client {

    public static void main(String[] args) {
        Car xcar = new Xcar();
        xcar.startEngin();
        xcar.go();
        System.out.println("Umboon");
        System.out.println("Malee");
    }

}
