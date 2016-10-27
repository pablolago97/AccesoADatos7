
package productsstream;


public class Product {
    String codigo=null;
    String descripcion=null;
    Double prezo=0.0;

    public Product(String codigo, String descripcion, Double prezo) {
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.prezo=prezo;
    }

    public Product() {
      this.codigo=null;
      this.descripcion=null;
      this.prezo=0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrezo() {
        return prezo;
    }

    public void setPrezo(Double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Product{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", prezo=" + prezo + '}';
    }
    
    
    
    
}
