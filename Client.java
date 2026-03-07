public class Client {

    public static void main(String[] args) {

        Furniture chair = new Chair(5);
        Furniture table = new Table(4, 2);
        Furniture sofa = new Sofa(10);

        ShippingVisitor visitor = new ShippingCostVisitor();

        chair.accept(visitor);
        table.accept(visitor);
        sofa.accept(visitor);

    }

}