/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0040482322022
 */
package pessoa;

public class Main {
    public static void main(String[] args) {

        FormattedPerson p1 = new FormattedPerson("John", "Smith", "12.345.678-9");
        FormattedPerson p2 = new FormattedPerson("Mary", "Johnson", "98.765.432-1");

        System.out.println("=== Person 1 ===");
        System.out.println(p1.nameLastName());
        System.out.println(p1.lastNameName());
        System.out.println(p1.lastNameDocument());

        System.out.println("\n=== Person 2 ===");
        System.out.println(p2.nameLastName());
        System.out.println(p2.lastNameName());
        System.out.println(p2.lastNameDocument());
    }
}