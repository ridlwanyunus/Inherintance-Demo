/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintancedemo.modul2.latihan3;

import inherintancedemo.latihan.*;

/**
 *
 * @author didik
 */
public class Z extends X{
    Y y = new Y();

    Z() {
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
