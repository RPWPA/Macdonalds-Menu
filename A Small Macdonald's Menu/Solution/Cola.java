/**
 * Cola
 */
public class Cola extends mealDecorator {

    public Cola(mealItem S)
    {
        super(S);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Coke ");
    }

}