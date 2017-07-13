import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	//private Subject weatherData;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable){
		//this.weatherData = weatherData;
		//weatherData.registerObserver(this);
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/**
	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	**/
	
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
	}
}
