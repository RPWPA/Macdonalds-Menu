/**
 * fries
 */
public class Fries extends mealDecorator{

    public Fries(mealItem S)
    {
        super(S);
    }
    @Override
    public void display() {
        super.display();
        System.out.println(" Fries ");
    }

}