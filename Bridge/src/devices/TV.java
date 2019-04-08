package devices;

public class TV implements Device {
	Boolean on = false;
	
	public TV() {
		
	}
	
	@Override
	public Boolean isOn() {
		return this.on;
	}

	@Override
	public void turnOn() {
		this.on = true;
		System.out.println("Turning the telly on");
	}

	@Override
	public void turnOff() {
		this.on = false;
		System.out.println("Turning the telly off");
	}
}
