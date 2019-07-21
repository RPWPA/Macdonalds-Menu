/**
 * director
 */
public class director {

    public plainBurgerBuilder builder;

    public director(plainBurgerBuilder Builder)
    {
        builder = Builder;
    }

    public void setBuilder(plainBurgerBuilder Builder)
    {
        builder = Builder;
    }
    public void createSandwich()
    {
        builder.createSandwich();
    }
}