/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formattedperson.java;

/**
 *
 * @author 0040482322022
 */
public class FormattedPerson extends Pessoa implements NameFormatInterface {

    public FormattedPerson(String name, String lastName, String rg) {
        super(name, lastName, rg);
    }

    @Override
    public String nameLastName() {
        return getName() + " " + getLastName();
    }

    @Override
    public String lastNameName() {
        return getLastName() + ", " + getName();
    }

    @Override
    public String lastNameDocument() {
        return getLastName() + ": " + getRg();
    }
}