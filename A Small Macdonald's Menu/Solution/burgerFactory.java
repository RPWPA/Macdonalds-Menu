/**
 * burgerFactory
 */
public class burgerFactory {

    public burgerFactory(){};
    public plainBurgerBuilder getBurgerBuilder(String s)
    {
        if (s == "doublecheeseburger")
        {
            return new doubleCheeseBurgerBuilder();
        }
        if (s == "cheeseburger")
        {
            return new cheeseBurgerBuilder();
        }
        else if (s == "mushroomandswissburger")
        {
            return new mushroomAndSwissBurgerBuilder();
        }
        else 
        {
            return null;
        }
    }
}