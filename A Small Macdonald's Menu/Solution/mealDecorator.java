/**
 * fries
 */
public abstract class mealDecorator implements mealItem{

    protected mealItem sandwich;

    public mealDecorator(mealItem S)
    {
        sandwich = S;
    }
    @Override
    public void display() {
        sandwich.display();
    }   

}