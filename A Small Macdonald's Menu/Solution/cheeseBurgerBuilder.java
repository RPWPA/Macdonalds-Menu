/**
 * cheeseBurger
 */
public class cheeseBurgerBuilder extends plainBurgerBuilder{


    public cheeseBurgerBuilder()
    {
        sandwich = new Sandwich();
    }
    
    @Override
    public void createSandwich()
    {
        sandwich.add(new LOWERBREADPART());
        sandwich.add(new beef());
        sandwich.add(new pasteurizedProcessAmericanCheese());
        sandwich.add(new Ketchub());
        sandwich.add(new pickleSlices());
        sandwich.add(new normalOnions());
        sandwich.add(new UPPERBREADPART());
    }
    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}