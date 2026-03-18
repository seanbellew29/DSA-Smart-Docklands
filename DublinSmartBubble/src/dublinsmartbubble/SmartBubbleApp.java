/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dublinsmartbubble;

/**
 *
 * @author Seán
 */
public class SmartBubbleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SmartBubbleGUI smartGUI = new SmartBubbleGUI();
        smartGUI.setVisible(true);
        
        SmartBubbleQueue smartQ = new SmartBubbleQueue();
        
        DebrisType d1 = new PlasticDebris("Bottle", "Small");
        DebrisType d2 = new MedicalWaste("Syringe", "Medium");
        
        smartQ.add(d1);
        smartQ.add(d2);
        
        System.out.println("Removing " + smartQ);
    }
    
}
