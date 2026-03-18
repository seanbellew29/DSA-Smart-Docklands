/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class OrganicWaste extends DebrisType{

    public OrganicWaste(String debrisType, String size) {
        super(debrisType, size);
    }

    @Override
    public String getDescription() {
        return "Organic waste: " + debrisType + " Size: " + size;
    }
}
