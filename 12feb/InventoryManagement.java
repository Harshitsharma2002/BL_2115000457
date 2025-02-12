class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagementSystem {
    private Item head;

    // ✅ Add item at the beginning
    public void addAtBeginning(int itemId, String itemName, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // ✅ Add item at the end
    public void addAtEnd(int itemId, String itemName, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // ✅ Add item at a specific position
    public void addAtPosition(int position, int itemId, String itemName, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, quantity, price);
        if (position == 0 || head == null) {
            addAtBeginning(itemId, itemName, quantity, price);
            return;
        }
        Item temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // ✅ Remove an item by Item ID
    public void removeByItemId(int itemId) {
        if (head == null) return;

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // ✅ Update quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID " + itemId + " not found.");
    }

    // ✅ Search for an item by Item ID
    public void searchByItemId(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item -> ID: " + temp.itemId + " | Name: " + temp.itemName +
                        " | Quantity: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    // ✅ Search for an item by Item Name
    public void searchByItemName(String itemName) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item -> ID: " + temp.itemId + " | Name: " + temp.itemName +
                        " | Quantity: " + temp.quantity + " | Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Item with name " + itemName + " not found.");
        }
    }

    // ✅ Calculate total inventory value (Price * Quantity)
    public double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        return totalValue;
    }

    // ✅ Sort inventory by Item Name
    public void sortByItemName() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Item current = head;
            while (current.next != null) {
                if (current.itemName.compareToIgnoreCase(current.next.itemName) > 0) {
                    swapItems(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // ✅ Sort inventory by Price (ascending)
    public void sortByPrice() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Item current = head;
            while (current.next != null) {
                if (current.price > current.next.price) {
                    swapItems(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // ✅ Helper function to swap two items
    private void swapItems(Item a, Item b) {
        int tempId = a.itemId;
        String tempName = a.itemName;
        int tempQuantity = a.quantity;
        double tempPrice = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = tempId;
        b.itemName = tempName;
        b.quantity = tempQuantity;
        b.price = tempPrice;
    }

    // ✅ Display all items
    public void displayAllItems() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            System.out.println("Item -> ID: " + temp.itemId + " | Name: " + temp.itemName +
                    " | Quantity: " + temp.quantity + " | Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();

        inventory.addAtBeginning(101, "Laptop", 5, 55000.0);
        inventory.addAtEnd(102, "Mouse", 15, 800.0);
        inventory.addAtPosition(1, 103, "Keyboard", 10, 1500.0);

        System.out.println("\n=== Display All Items ===");
        inventory.displayAllItems();

        System.out.println("\n=== Search Item by ID (102) ===");
        inventory.searchByItemId(102);

        System.out.println("\n=== Update Quantity of Item ID 103 ===");
        inventory.updateQuantity(103, 20);
        inventory.displayAllItems();

        System.out.println("\n=== Total Inventory Value ===");
        System.out.println("Total Value: " + inventory.calculateTotalValue());

        System.out.println("\n=== Sorting by Item Name ===");
        inventory.sortByItemName();
        inventory.displayAllItems();

        System.out.println("\n=== Sorting by Price ===");
        inventory.sortByPrice();
        inventory.displayAllItems();

        System.out.println("\n=== Removing Item with ID 102 ===");
        inventory.removeByItemId(102);
        inventory.displayAllItems();
    }
}