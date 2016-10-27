package productsstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Productsstream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Product po1 = new Product("cod1", "parafusos", 3.0);
        Product po2 = new Product("cod2", "arandelas", 4.0);
        File products = new File("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/primitivewritechars/src/products.txt");
        DataOutputStream write = new DataOutputStream(new FileOutputStream(products));
        DataInputStream read = new DataInputStream(new FileInputStream(products));
        //Grabar valores primer obx
        write.writeUTF(po1.getCodigo());
        write.writeUTF(po1.getDescripcion());
        write.writeDouble(po1.getPrezo());
        //Grabar valores segundo obx
        write.writeUTF(po2.getCodigo());
        write.writeUTF(po2.getDescripcion());
        write.writeDouble(po2.getPrezo());
        //Novo obxeto
        String codigo = read.readUTF();
        String producto = read.readUTF();
        Double precio =read.readDouble();
        
        Product po3 = new Product(codigo, producto, precio);
        
        System.out.println(po3.toString());
    }

}
