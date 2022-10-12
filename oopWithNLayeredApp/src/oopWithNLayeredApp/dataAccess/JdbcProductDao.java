package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
//Dao=Data Access Object
    public void add(Product product){
        //sadece ve sadece DB erisim kodlari buraya yazilir. SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }

}
