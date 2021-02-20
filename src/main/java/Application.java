import QuestionTwo.entity.Product;
import QuestionTwo.entity.SmallProduct;
import QuestionTwo.entity.SmallWarehouse;
import QuestionTwo.entity.Warehouse;
import QuestionTwo.repository.SmallWarehouseRepository;
import com.sun.tools.javac.util.List;

public class Application {

    public static void main(String[] args) {
        SmallWarehouseRepository repository = SmallWarehouseRepository.getInstance();
        repository.initializeWarehouse();

        Warehouse warehouse = repository.displayDetails(1L);
        System.out.println(warehouse.getName());

        Warehouse warehouse2 = repository.displayDetails(2L);
        System.out.println(warehouse2.getName());

        Warehouse warehouse3 = repository.displayDetails(3L);
        System.out.println(warehouse3.getName());

        Warehouse warehouse4 = new SmallWarehouse(4L, "Janpath Warehouse");
        repository.add(warehouse4);


        Product product1 = new SmallProduct("Chicken", 2.40);
        Product product2 = new SmallProduct("Eggs", 1.30);

        repository.addProduct(4L, List.of(product1, product2));

        System.out.println(repository.displayDetails(4L).getProducts().get(0).getName());
        System.out.println(repository.averagePriceOfProducts(4l));
    }
}
