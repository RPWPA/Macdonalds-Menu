/**
 * mushroomAndSwissBurger
 */
public class mushroomAndSwissBurgerBuilder extends plainBurgerBuilder{
    public mushroomAndSwissBurgerBuilder()
    {
        sandwich = new Sandwich();
    }
    
    @Override
    public void createSandwich()
    {
        sandwich.add(new lowerArtisanRoll());
        sandwich.add(new beef());
        sandwich.add(new swissCheese());
        sandwich.add(new mushrooms());
        sandwich.add(new friedOnionStrings());
        sandwich.add(new bistoryAioli());
        sandwich.add(new upperArtisanRoll());

    }    
    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}