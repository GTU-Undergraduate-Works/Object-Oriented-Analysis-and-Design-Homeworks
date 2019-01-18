package duraklefkan.gtu.cse443.hw2.question3.design1;

/**
 * Demo class to test program.
 */
public class Demo {

    /**
     * main method to test program.
     * @param args main arguments
     */
    public static void main(String[] args) {

        System.out.println("----------------- PRODUCTION OF TPX100 TYPE PLANE --------------------");
        PlaneFactory planeFactory = new PlaneFactory();
        PlaneShop planeShop = new PlaneShop(planeFactory);
        planeShop.producePlane(ModelType.TPX100);

        System.out.println("\n----------------- PRODUCTION OF TPX200 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX200);

        System.out.println("\n----------------- PRODUCTION OF TPX300 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX300);
    }
}
