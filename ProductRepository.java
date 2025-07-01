package com.example.product;

public class ProductRepository{
    private final List<ProductApplication> products = new ArrayList<>();
    private long currebtId = 1;

    public ProductApplication save(com.example.product.Product product){
        product.setId(currebtId++);
        products.add(product);
        return product;
    }
    public Optional<ProductApplication> findById(Long Id){
        return products.stream().filter(p -> p.getid().equals(id)).findFirst();
    }
    public List<ProductAplication> findAll(){
        return new ArrayList<>(products);
    }
}
