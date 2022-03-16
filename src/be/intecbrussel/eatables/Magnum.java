package be.intecbrussel.eatables;

public class Magnum  implements IEatable {

    private MagnumType type;

//Constructor-----


    public Magnum(MagnumType type) {
        this.type = type;
    }

    //Getter-----


    public MagnumType getType() {
        return type;
    }

    //Setter-----


    public void setType(MagnumType type) {
        this.type = type;
    }


    @Override
    public void eat() {
        System.out.println("You eat "+ this.type);
    }
}
