public abstract class car {
    String name;
    int price;
    car(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    void get_details()
    {
        System.out.println("name="+name);
        System.out.println("price="+price);
    }
    abstract int get_price();

}
