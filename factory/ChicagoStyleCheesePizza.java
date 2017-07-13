import java.util.*;

public class ChicagoStyleCheesePizza extends Pizza{
	
	public ChicagoStyleCheesePizza(){
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thicc Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozarella Cheese");
	}
	
	void cut(){
		System.out.println("Cuttingte pizza into square slices");
	}
}
