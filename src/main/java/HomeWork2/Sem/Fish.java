package HomeWork2.Sem;

public class Fish extends Herbivores implements Swimming{
    public Fish(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfSwim() {
        return 120;
    }
    public String toString(){
        return "I'm fish " + super.toString()  + ", speed of swim " + speedOfSwim();
    }

    @Override
    public String say() {
        return "Bool-bool";
    }
}