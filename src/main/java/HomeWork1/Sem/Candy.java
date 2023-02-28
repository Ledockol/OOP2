package HomeWork1.Sem;


public class Candy extends Product {
    private Integer weight;
    public Candy(String name, Double price) {
        super(name, price);
    }
    public Candy(String name, Double price, Integer weight) {
        this(name, price);
        this.weight = weight;
    }
    @Override
    public String toString(){
        return String.format("%s weight = %d  " , super.toString(), weight);
    }
}