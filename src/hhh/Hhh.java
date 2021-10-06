
package hhh;
import java.util.*;
public class Hhh {
    public static void main(String[] args) {
        ArrayList<String> getit= new ArrayList<String>();
        getit.add("Malik");
        getit.add("Monk");
        getit.add("Carmelo");
        getit.add("Anthony");
        getit.add("Davis");
        getit.add("Bazemore");
         for(int j=0;j<getit.size();j++){
            System.out.print(getit.get(j)+" ");
        }
         System.out.println();
         System.out.println("Sorted ArrayeList");
         Collections.sort(getit);// sorting element of ArrayList alphabetically 
         for(int i=0;i<getit.size();i++){
            System.out.print(getit.get(i)+" ");
        }
    LinkedList<String> outta=new LinkedList<String>();
    outta.add("Jordan");
    outta.add("Poole");
    outta.add("Loneey");
    outta.add("Draymond");
    
    for(int j=0;j<outta.size();j++){
    System.out.println(outta.get(j));
}
    outta.addFirst("Chief Curry");
    outta.addLast("steve Kerr");
    for(int j=0;j<outta.size();j++){
    System.out.print(outta.get(j)+" ");
}
    System.out.println();
    Collections.sort(outta);// sorting element of Linked List alphabetically 
    for(int j=0;j<outta.size();j++){
    System.out.print(outta.get(j)+" ");
}
}
}

