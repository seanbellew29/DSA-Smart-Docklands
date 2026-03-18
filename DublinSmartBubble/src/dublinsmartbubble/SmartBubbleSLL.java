/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class SmartBubbleSLL implements DebrisInterface2{
    private Node head;

    @Override
    public void add(DebrisType debris) {
        Node newNode = new Node(debris);
        if(head == null)
            head = newNode;
        else{
            Node curr = head;
            while(curr.next != null)
                curr = curr.next;
                curr.next = newNode;
        }
    }

    @Override
    public boolean remove(String debrisType) {
        Node curr = head, prev = null;
        while(curr != null) {
            if(curr.data.getDebrisType().equalsIgnoreCase(debrisType)) {
                if(prev == null) {
                    head = curr.next;
                } else
                    prev.next = curr.next;
                    return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null; 
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        Node curr = head;
        while(curr != null) {
            buff.append(curr.data.getDescription()).append("\n");
            curr = curr.next;
        }
        return buff.toString();
    }

    public boolean search(String debrisType) {
        Node curr = head;
        while(curr != null) {
            if(curr.data.getDebrisType().equalsIgnoreCase(debrisType)) 
                return true;
            curr = curr.next;
        }
        return false;
    }
}
