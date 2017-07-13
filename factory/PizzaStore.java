public abstract class PizzaStore{
	
	Pizza pizza;
	
	public Pizza orderPizza(String type){
		
		this.pizza = createPizza(type);
		
		this.pizza.prepare();
		this.pizza.bake();
		this.pizza.cut();
		this.pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
