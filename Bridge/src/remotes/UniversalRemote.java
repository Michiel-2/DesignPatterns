package remotes;

import devices.Device;

public class UniversalRemote implements Remote {
	Device device;
	
	public UniversalRemote(Device device) {
		this.device = device;
	}
	
	@Override
	public void powerButton() {
		device.turnOn();

	}

}
