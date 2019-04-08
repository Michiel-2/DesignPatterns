import devices.TV;
import remotes.Remote;
import remotes.SonyRemote;
import remotes.UniversalRemote;

public class Demo {

	public static void main(String[] args) {
		Remote sonyRemote = new SonyRemote(new TV());
		
		Remote philipsRemote = new UniversalRemote(new TV());
		
		sonyRemote.powerButton();
		sonyRemote.powerButton();
		philipsRemote.powerButton();
		philipsRemote.powerButton();

	}

}
