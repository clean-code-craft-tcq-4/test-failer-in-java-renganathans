package alerter;
import com.tcq.training.alerter.service.NetworkController;
import com.tcq.training.alerter.service.NetworkControllerUtil;

public class Alerter {
	private static int alertFailureCount = 0;
	NetworkController networkContext;

	public void alertInCelcius(float celcius) {
		updateAlertFailureCount(networkContext.alert(celcius));
	}

	public float convertToCencius(float farenheit) {
		return (farenheit - 32) * 5 / 9;
	}

	private void initiateNetworkController() {
		networkContext = NetworkControllerUtil.getNetworkController();
	}

	public void updateAlertFailureCount(int returnCode) {
		if (returnCode == 500)
			alertFailureCount += 1;
	}

	public static void main(String[] args) {

		Alerter alerter = new Alerter();
		alerter.initiateNetworkController();
		float celcius = alerter.convertToCencius(400.5f);
		alerter.alertInCelcius(celcius);
		celcius = alerter.convertToCencius(303.6f);
		alerter.alertInCelcius(celcius);

		assert (alertFailureCount == 1);
		System.out.printf("%d alerts failed.\n", alertFailureCount);
		System.out.println("All is well \n");
	}
}
