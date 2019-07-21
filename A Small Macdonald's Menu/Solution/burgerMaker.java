/**
 * burgerMaker
 */
public class burgerMaker {
    public static burgerFactory br = new burgerFactory();
    
    public static void main(String[] args) {
      
        
        System.out.println("Cheese Burger: ");
        plainBurgerBuilder burgarBuilder = br.getBurgerBuilder("cheeseburger");  // I get the builder of the sandwich I want to make.
        director Director = new director(burgarBuilder); // I create the director with the type of builder I want. 
        Director.createSandwich();  // I tell the director to create the sandwich. 
        Sandwich sandwich = burgarBuilder.getSandwich(); // the builder returns the sandwich to the user as per the lecture said. 
        mealItem newMeal = sandwich;
        newMeal.display();
        //sandwich.display(); // I display the sandwich. 
        
        


        System.out.println("========================================");
        System.out.println("Double Cheese Burger WITH FRIES: ");

        burgarBuilder = br.getBurgerBuilder("doublecheeseburger"); 
        Director.setBuilder(burgarBuilder); // set the builder. 
        Director.createSandwich();
        sandwich = burgarBuilder.getSandwich();
        newMeal = new Fries(sandwich);
        newMeal.display();
        // sandwich.display();
        System.out.println("========================================");
        System.out.println("Mushroom And Swiss Burger COMBO SET: ");
        
        burgarBuilder = br.getBurgerBuilder("mushroomandswissburger");
        Director.setBuilder(burgarBuilder); // set the builder. 
        Director.createSandwich();
        sandwich = burgarBuilder.getSandwich();
        newMeal = new Cola(new Fries(sandwich));
        newMeal.display();


        /*
        //sandwich.display();
        burgar = br.createBurger("doublecheeseburger");
        burgar.display();
            
        System.out.println("========================================");

        burgar = br.createBurger("mushroomandswissburger");
        burgar.display();
        */
    }
}