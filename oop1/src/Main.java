public class Main {

    public static void main(String[] args) {

    String mesaj = "Vade oranı";

      //P si buyuk nesne p si kucuk degisken ismidir.
        //set value
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDisCount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        //get value
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDisCount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDisCount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");


        Product[] products = {product1, product2, product3};

        for (Product product:products) {
            System.out.println(product.getName());

        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Emre");
        individualCustomer.setLastName("Yıldırım");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("053333333");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        //inheritance ikiside customer ama farklı ozellikleri var kimlikNo/vergiNo gibi.
        //ama yine de kabul ediyor buna dikkat et. (extends Customer) dedik cünkü.
        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}