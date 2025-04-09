import java.util.ArrayList;
import java.util.Scanner;

class Shopping {
    ArrayList<String> list = new ArrayList<>();

    void addItems(Scanner sc) {
        System.out.println("Write your shopping list.");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " : ");
            String item = sc.nextLine();
            list.add(item);
        }
    }

    void deleteItem(String delItem) {
        if (list.remove(delItem)) {
            System.out.println("Item \"" + delItem + "\" deleted from the list.");
        } else {
            System.out.println("Item \"" + delItem + "\" not found in the list.");
        }
    }

    void addAtPosition(String positionItem, int n) {
        if (n >= 0 && n <= list.size()) {
            list.add(n-1, positionItem);
            System.out.println("Item \"" + positionItem + "\" added at position " + n + ".");
        } else {
            System.out.println("This position is not available.");
        }
    }

    void addAtEnd(String endItem) {
        list.add(endItem);
        System.out.println("Item \"" + endItem + "\" added at the end.");
    }

    void print() {
        System.out.println("\nCurrent Shopping List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i +1) + " : " + list.get(i));
        }
    }
}

public class Task30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopping list = new Shopping();

        list.addItems(sc);
        list.print();

        System.out.print("\nEnter the name of the item to delete: ");
        String item = sc.nextLine();
        list.deleteItem(item);
        list.print();

        System.out.print("\nEnter the item to add: ");
        String positionItem = sc.nextLine();
        System.out.print("Enter the position to insert it at: ");
        int n = sc.nextInt();
        sc.nextLine(); // Fix the newline issue
        list.addAtPosition(positionItem, n);
        list.print();

        System.out.print("\nEnter the item to add at end: ");
        String endItem = sc.nextLine();
        list.addAtEnd(endItem);
        list.print();

        sc.close();
    }
}
