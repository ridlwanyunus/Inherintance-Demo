/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintancedemo.modul1;

/**
 *
 * @author didik
 */
public class Person {
    private String nama;
    private String gender;

    public Person() {
    }

    public Person(String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public static void main(String[] args){
        Person person = new Person("didik", "men");
        
        System.out.println(person.getNama());;
    }
}
