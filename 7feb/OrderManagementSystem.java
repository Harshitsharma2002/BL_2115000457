class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-08-01");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-08-02", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-08-03", "TRK67890", "2025-08-07");

        System.out.println("Order Details:");
        order.displayOrderDetails();
        System.out.println("------------------------------");

        System.out.println("Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("------------------------------");

        System.out.println("Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
    }
}