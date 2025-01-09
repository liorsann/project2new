public abstract class Property {
    private String address;
    private int area;
    private int price;

    // Constructor
    public Property(String address, int area, int price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }
    public abstract void taxIt();

    // Getters
    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty() || address.split(" ").length < 2) {
           this.address="na";
           return;
        }
        this.address = address;
    }

    public void setArea(int area) {
        if (area < 0) {
           this.area=0;
           return;
        }
        this.area = area;
    }

    public void setPrice(int price) {
        if (price < 0) {
            this.price=0;
            return;
        }
        this.price = price;
    }

    // toString
    @Override
    public String toString() {
        return "Address: " + address + ", Area: " + area + " sqm, Price: $" + price;
    }
}

