/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public interface DebrisInterface2 {
     public void add(DebrisType debris);
    public String toString();
    public boolean remove(String debrisType);
    int size();
    public boolean isEmpty();
}
