package QuestionTwo.repository;

import QuestionTwo.entity.Product;
import QuestionTwo.entity.Warehouse;

import java.util.List;

public interface IWarehouse {
    void initializeWarehouse();
    Warehouse displayDetails(Long id);
    void add(Warehouse warehouse);
    void update(Long id, String name);
    void delete(Long id);
    void addProduct(Long id, List<Product> productList);
    Double averagePriceOfProducts(Long warehouseId);
}
