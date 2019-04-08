package remotes;

import devices.Device;

public class SonyRemote implements Remote {
	Device device;
	
	public SonyRemote(Device device) {
		this.device = device;
	}
	
	@Override
	public void powerButton() {
		if (!device.isOn()) {

			device.turnOn();	
		} else {
			device.turnOff();
		}
	}
	
}
