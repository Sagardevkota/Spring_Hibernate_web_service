package org.example.sagar.products;


import org.example.sagar.entity.ProductEntity;
import org.example.sagar.services.ProductsServices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
public class Products {

    ProductsServices services=new ProductsServices();

    @GET
    @Path("/getProducts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductEntity> getProducts(){
        List<ProductEntity> list= services.getProducts();
        return list;

    }

    @POST
    @Path("/postProducts")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addProducts(ProductEntity product){
       services.addProducts(product);
    }



    @DELETE
    @Path("/removeProducts/{productId}")
    public void deleteProducts(@PathParam("productId") int productId){
        services.deleteProduct(productId);
    }



}
