/**
 * sandwich
 */
import java.util.ArrayList;
import java.util.List;
public class Sandwich implements item{

    private List<item> sandwichIngredients;
    Sandwich()
    {
        sandwichIngredients = new ArrayList<item>();
    }
    @Override
    public void display() {
        for (item var : sandwichIngredients) {
            var.display();
        }
    }

    public void add(item ingredient)
    {
        sandwichIngredients.add(ingredient);
    }

    
}