public class ShippingCostVisitor implements ShippingVisitor {

    @Override
    public void visitChair(Chair chair) {

        double cost = 10; // flat shipping rate
        System.out.println("Chair shipping cost: $" + cost);

    }

    @Override
    public void visitTable(Table table) {

        double area = table.getLength() * table.getWidth();
        double cost = area * 0.5;

        System.out.println("Table shipping cost: $" + cost);

    }

    @Override
    public void visitSofa(Sofa sofa) {

        double cost = sofa.getVolume() * 2;

        System.out.println("Sofa shipping cost: $" + cost);

    }

}