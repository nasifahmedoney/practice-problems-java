import java.util.ListIterator;

import java.util.Scanner;

import java.util.LinkedList;

public class itr
{
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        /*LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("nasif");
        linkedlist.add("ahmed");
        linkedlist.add("oney");

        //System.out.println(linkedlist);

        ListIterator<String> iterator = linkedlist.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        */
        boolean integer = scanner.hasNextInt();
        while(integer)
        {
            int i = scanner.nextInt();
            scanner.nextLine();
            System.out.println(i);
        }

        //check isNan(variable);
        //check string to int and others coversion
        scanner.close();
    }
}