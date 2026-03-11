/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class MetalDebris extends DebrisType{

    public MetalDebris(String debrisType, String size) {
        super(debrisType, size);
    }
    
    public String description(){
        return "Metal waste: " + debrisType + "size : " + size;
    }
    
    
}
