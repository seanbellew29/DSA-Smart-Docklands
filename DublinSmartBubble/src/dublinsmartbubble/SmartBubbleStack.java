/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class SmartBubbleStack implements DebrisInterface{
    
    private Node top;

    @Override
    public void add(DebrisType debris) {
        Node newNode = new Node(debris);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public DebrisType remove() {
        if(top == null) 
            return null;
        
        DebrisType removed = top.data;
        top = top.next;
        return removed;
    }

    @Override
    public boolean isEmpty() {
        return top == null; 
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        Node curr = top;
        while(curr != null) {
            buff.append(curr.data.getDescription()).append("\n");
            curr = curr.next;
        }
        return buff.toString();
    }
}