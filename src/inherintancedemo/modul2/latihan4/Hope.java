/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintancedemo.modul2.latihan4;

/**
 *
 * @author didik
 */
public class Hope {
    public static void main(String argv[]) {
        Hope h = new Hope();
    }

    protected Hope() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
