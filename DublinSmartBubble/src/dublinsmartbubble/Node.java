/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class Node {
   protected DebrisType data;
    protected Node next;
    
    public Node(DebrisType data){
        this.data = data;
        this.next = null;
    }
    
    
}
