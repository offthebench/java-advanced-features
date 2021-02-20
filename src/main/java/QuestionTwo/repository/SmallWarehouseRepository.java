package QuestionTwo.repository;

import QuestionTwo.entity.Product;
import QuestionTwo.entity.SmallWarehouse;
import QuestionTwo.entity.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class SmallWarehouseRepository implements IWarehouse {

    private static SmallWarehouseRepository instance;
    private static List<Warehouse> warehouseList;

    private SmallWarehouseRepository() {
        warehouseList = new ArrayList<>();
    }

    public static SmallWarehouseRepository getInstance() {
        if (null == instance) {
            instance = new SmallWarehouseRepository();
        }
        return instance;
    }

    @Override
    public void initializeWarehouse() {
        Warehouse warehouse1 = new SmallWarehouse(1L, "Bandra Warehouse");
        Warehouse warehouse2 = new SmallWarehouse(2L, "Kurla Warehouse");
        Warehouse warehouse3 = new SmallWarehouse(3L, "Bandstand Warehouse");

        warehouseList.add(warehouse1);
        warehouseList.add(warehouse2);
        warehouseList.add(warehouse3);
    }

    @Override
    public Warehouse displayDetails(Long id) {
        Warehouse warehouse = getWarehouse(id);
        if (warehouse != null) return warehouse;
        return null;
    }

    @Override
    public void add(Warehouse warehouse) {
        warehouseList.add(warehouse);
    }

    @Override
    public void update(Long id, String name) {
        Warehouse warehouseToUpdate = null;
        for (Warehouse warehouse : warehouseList) {
            if (warehouse.getId().equals(id)) {
                warehouseToUpdate = warehouse;
            }
        }

        if (null != warehouseToUpdate) {
            warehouseToUpdate.setName(name);
        }
    }

    @Override
    public void delete(Long id) {
        for (Warehouse warehouse : warehouseList) {
            if (warehouse.getId().equals(id)) {
                warehouseList.remove(warehouse);
            }
        }

    }

    @Override
    public void addProduct(Long id, List<Product> productList) {
        Warehouse warehouse = getWarehouse(id);
        if (warehouse != null) {
            warehouse.setProducts(productList);
        }
    }

    @Override
    public Double averagePriceOfProducts(Long warehouseId) {
        Warehouse warehouse = getWarehouse(warehouseId);
        double sum = 0;
        double avg = 0;
        if (null != warehouse) {
            int totalNumberOfProducts = warehouse.getProducts().size();
            for (Product product : warehouse.getProducts()) {
                sum += product.getPrice();
            }

            avg = sum/totalNumberOfProducts;
        }

        return avg;
    }

    private Warehouse getWarehouse(Long id) {
        for (Warehouse warehouse : warehouseList) {
            if (warehouse.getId().equals(id)) {
                return warehouse;
            }
        }
        return null;
    }
}
