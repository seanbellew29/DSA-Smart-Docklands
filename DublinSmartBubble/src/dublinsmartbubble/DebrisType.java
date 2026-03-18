/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class DebrisType {
    protected String debrisType;
    protected String size;

    public DebrisType(String debrisType, String size) {
        this.debrisType = debrisType;
        this.size = size;
    }

    public void setDebrisType(String debrisType) {
        this.debrisType = debrisType;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDebrisType() {
        return debrisType;
    }

    public String getSize() {
        return size;
    }
    
    public String getDescription(){
        return "Debris Type : " + debrisType + "size : " + size;
    }

    
}
