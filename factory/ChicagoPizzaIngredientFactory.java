public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough(){
		return new ThiccCrustDough();
	}
	
	public Sauce createSauce(){
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese(){
		return new Mozarella();
	}
	
	public Veggies[] createVeggies(){
		Veggies veggies = {new Eggplant(), new Spinach(), new BlackOlives()};
		return veggies;
	}
	
	public Pepperoni createPepperoni(){
		return SlicedPepperoni();
	}
	
	public Clams createClams(){
		return new FrozenClams();
	}
}

