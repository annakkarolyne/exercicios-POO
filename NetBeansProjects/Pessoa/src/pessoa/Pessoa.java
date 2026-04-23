/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author 0040482322022
 */
public class Pessoa {
    private String name, lastName, rg;

    public Pessoa(String name, String lastName, String rg) {
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
}
