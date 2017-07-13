public class NYPizzaStore extends PizzaStore{
	
	
	protected Pizza createPizza(String item){
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		/**
		else if(item.equals("pepperoni")){
			pizza = new NYStylePepperoniPizza();
		}
		else if(item.equals("clam")){
			pizza = new NYStyleClamPizza();
		}
		else if(item.equals("veggie")){
			pizza = new NYStyleVeggiePizza();
		}
		* **/
		return pizza;
	}
}
