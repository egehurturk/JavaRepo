package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder("Sydney", placesToVisit);
        addInOrder("Melbourne", placesToVisit);
        addInOrder("Brisbane", placesToVisit);
        addInOrder("Pearth", placesToVisit);
        addInOrder("Canberra", placesToVisit);
        addInOrder("Adeleide", placesToVisit);
        addInOrder("Darwin", placesToVisit);
        printList(placesToVisit);

        addInOrder("Alice Springs", placesToVisit);
        addInOrder("Darwin", placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        // iterator
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) { // .hasNext() checks if it has a pointer avaliable
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // more performant way to iterate through a list
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); // gives us a number (0)->equal, (1)->
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0) {
                // newCitry should be appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // go back to the previous (Only in ListIterator<E>)
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()) {
            System.out.println("No cities in the list");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else{
                        System.out.println("reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        goingForward = true;
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }

    }

    private static void printMenu() {
        System.out.println("Avaliable actions:\n press");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");
    }

}
