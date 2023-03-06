package HomeWork2.Sem;

public class Duck extends Herbivores implements Flyable, Runable, Swimming{
    public Duck(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 38;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of fly " + speedOfFly() + ", speed of swim " + speedOfSwim();
    }
    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 8;
    }
    @Override
    public String say() {
        return "Krya-krya";
    }
}