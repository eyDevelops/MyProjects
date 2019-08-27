/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorListPkg;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ethias Young
 */
public class ColorListMain {
    public static void main(String[] args){
        
        LinkedList<Object> colorList = new LinkedList<Object>();
        colorList.add("Cyan");
        colorList.add("Blue");
        colorList.add("Maroon");
        colorList.add("Mauve");
        
        
        String inputColor;
        String inputColorSecond;
        String inputColorPosition;
        String userColor;
        
        inputColor = JOptionPane.showInputDialog(null,
        "Add a color to the end of the list:",
        "Color List", JOptionPane.QUESTION_MESSAGE);
        
        colorList.addLast(inputColor);
        
         inputColorPosition = JOptionPane.showInputDialog(null,
        "Add a color to the second position of the list:",
        "Color List", JOptionPane.QUESTION_MESSAGE);
         
         colorList.add(inputColorPosition);
         
        System.out.println("Display the linked list forward: ");
        ListIterator<Object> colorIterator = colorList.listIterator();
        while (colorIterator.hasNext()){
            System.out.print(colorIterator.next() + " \n");
        }
        System.out.println();
        
        inputColorSecond = JOptionPane.showInputDialog(null,
        "Add a color to the beginning of the list:",
        "Color List", JOptionPane.QUESTION_MESSAGE);
        
        colorList.addFirst(inputColorSecond);
        
        
        System.out.println("Display the linked list backward: ");
        ListIterator<Object> colorBackIterator = colorList.listIterator(colorList.size());
        while (colorBackIterator.hasPrevious()){
            System.out.print(colorBackIterator.previous() + " \n");
        }
        System.out.println();
        
        userColor = JOptionPane.showInputDialog(null,
        "Please enter a color that is on the list:",
        "Color List", JOptionPane.QUESTION_MESSAGE);
        
        switch (userColor){
            case "Cyan": System.out.println("Cyan is at position 3");
                break;
            case "Yellow": System.out.println("Yellow is at position 1");
                break;
            case "Blue": System.out.println("Blue is at position 4");
                break;
            case "Maroon": System.out.println("Maroon is at position 5");
                break;
            case "Mauve": System.out.println("Mauve is at position 6");
                break;
            case "Green": System.out.println("Green is at position 7");
                break;
            case "Red": System.out.println("Red is at position 2"); 
            
            Default: System.out.println("Error: Please Try again.");
            System.exit(0);
        }
        
       /* if (userColor == "Cyan"){
            System.out.println("Cyan is at position 3");
        }
        else if (userColor == "Yellow"){
            System.out.println("Yellow is at position 1");
        }
        else if (userColor == "Blue"){
            System.out.println("Blue is at positon 4");
                    }
        else if (userColor == "Maroon"){
            System.out.println("Maroon is at positon 5");
        }
        else if (userColor == "Mauve"){
            System.out.println("Mauve is at position 6");
        }
        else if (userColor == "Green"){
            System.out.println("Green is at position 7");
        }
        else 
            System.out.println("Error: Please try again.");*/
        
            
        
            
        }
    }
    
