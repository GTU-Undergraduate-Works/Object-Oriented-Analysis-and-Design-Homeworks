package duraklefkan.gtu.cse443.hw2.question3.design2;

import duraklefkan.gtu.cse443.hw2.question3.design1.ModelType;

/**
 * Demo class to test program.
 */
public class Demo {

    /**
     * main method to test program.
     * @param args main arguments
     */
    public static void main(String[] args) {


        System.out.println("********************     DOMESTIC MARKET     ******************************");
        DomesticMarket domesticMarket = new DomesticMarket();
        PlaneShop planeShop = new PlaneShop(domesticMarket);
        System.out.println("----------------- PRODUCTION OF TPX100 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX100);
        System.out.println("\n----------------- PRODUCTION OF TPX200 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX200);
        System.out.println("\n----------------- PRODUCTION OF TPX300 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX300);

        System.out.println("\n\n********************     EURASIAN MARKET     ******************************");
        EurasiaMarket eurasiaMarket = new EurasiaMarket();
        planeShop = new PlaneShop(eurasiaMarket);
        System.out.println("----------------- PRODUCTION OF TPX100 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX100);
        System.out.println("\n----------------- PRODUCTION OF TPX200 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX200);
        System.out.println("\n----------------- PRODUCTION OF TPX300 TYPE PLANE --------------------");

        planeShop.producePlane(ModelType.TPX300);
        System.out.println("\n\n********************      OTHER MARKET       ******************************");
        OtherMarket otherMarket = new OtherMarket();
        planeShop = new PlaneShop(otherMarket);
        System.out.println("----------------- PRODUCTION OF TPX100 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX100);
        System.out.println("\n----------------- PRODUCTION OF TPX200 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX200);
        System.out.println("\n----------------- PRODUCTION OF TPX300 TYPE PLANE --------------------");
        planeShop.producePlane(ModelType.TPX300);

    }

}
