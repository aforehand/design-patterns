public class CaliforniaPizzaStore extends PizzaStore{
	Pizza createPizza(String item){
		
		if(item.equals("cheese")){
			pizza = new CaliforniaStyleCheesePizza();
		}
		else if(item.equals("pepperoni")){
			pizza = new CaliforniaStylePepperoniPizza();
		}
		else if(item.equals("clam")){
			pizza = new CaliforniaStyleClamPizza();
		}
		else if(item.equals("veggie")){
			pizza = new CaliforniaStyleVeggiePizza();
		}
		return pizza;
	}
}

