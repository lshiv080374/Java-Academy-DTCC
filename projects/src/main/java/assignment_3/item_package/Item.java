package assignment_3.item_package;

public class Item {

    private double price;
    private String description, name, type;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price != 0) {
            this.price = price;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(!description.isEmpty()) {
            this.description = description;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.isEmpty()) {
            this.type = type;
        }
    }
    @Override
    public String toString() {
        System.out.println("Name: " +  name);
        System.out.println("Description: " +  description);
        System.out.println("Type: " +  type);
        System.out.println("Price: " +  price);
        return name + " "+ description + " " + type+ " "  +price;
    }
}
