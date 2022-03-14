package be.intecbrussel.eatables;

public class Cone implements Eatable{

    private Flavor [] balls;

    public Flavor[] getBalls() {
        return balls;
    }

    public void setBalls(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {

    }
}
