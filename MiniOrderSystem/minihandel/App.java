package MiniOrderSystem.minihandel;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Hår Spray",25.0);
        Product product2 = new Product(2,"Pruttepude",15.0);
        Product product3 = new Product(3,"Rubber Duck",50.0);
        Product product4 = new Product(4,"Pineapple",20.0);
        Product product5 = new Product(5,"Apple",5.0);

        PercentDiscount p1 = new PercentDiscount(15);
        FixedDiscount f1 = new FixedDiscount(250,1000);

        Customer customer1 = new Customer("Peter", LocalDate.of(1997,12,20),p1);
        Customer customer2 = new Customer("Anne-Kirstine", LocalDate.of(1998,9,20),f1);

        Order order = new Order(1);
        Order order1 = new Order(2);
        Order order2 = new Order(3);
        Order order3 = new Order(4);
        Order order4 = new Order(5);
        Order order5 = new Order(6);

        order.createOrderLine(5,product1);
        order.createOrderLine(2,product2);

        order1.createOrderLine(1,product2);
        order1.createOrderLine(3,product3);

        order2.createOrderLine(2,product4);
        order2.createOrderLine(5,product3);

        order3.createOrderLine(2,product4);
        order3.createOrderLine(5,product3);

        order4.createOrderLine(2,product4);
        order4.createOrderLine(5,product3);

        order5.createOrderLine(2,product4);
        order5.createOrderLine(5,product3);

        customer1.addOrder(order);
        customer1.addOrder(order1);

        customer2.addOrder(order2);
        customer2.addOrder(order3);
        customer2.addOrder(order4);
        customer2.addOrder(order5);

        System.out.println(customer1.totalBuy());
        System.out.println(customer1.totalBuyWithDiscount());

        System.out.println(customer2.totalBuy());
        System.out.println(customer2.totalBuyWithDiscount());


    }
}
