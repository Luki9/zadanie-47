import java.util.Objects;

class Products  {


    private String producent;
    private double price;
    private String name;

    public Products(String producent, double price, String name) {
        this.producent = producent;
        this.price = price;
        this.name = name;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 &&
                Objects.equals(producent, products.producent) &&
                Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, price, name);
    }

    @Override
    public String toString() {
        return "Products{" +
                "producent='" + producent + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

}
