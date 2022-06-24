import java.util.LinkedList;
import java.util.List;

import com.tcq.training.colourCode.ColourCode;

public class Misaligned {

	void printColorMap(List<ColourCode> listOfColourCode) {
		for (ColourCode colourCode : listOfColourCode) {
			System.out.printf("%d  | %s | %s\n", colourCode.getPairNumber(), colourCode.getMajorColor(),
					colourCode.getMinorColor());
		}

	}

	List<ColourCode> generateColourCode() {
		String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
		String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
		List<ColourCode> listOfColourCode = new LinkedList<ColourCode>();
		int i = 0, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				listOfColourCode.add(new ColourCode.Builder().setPairNumber(i * 5 + j).setMajorColor(majorColors[i])
						.setMinorColor(minorColors[i]).build());
			}
		}
		return listOfColourCode;
	}

	public void testColourCode(List<ColourCode> listOfColourCode) {
		for (ColourCode colourCode : listOfColourCode) {
			assert (colourCode.getPairNumber() != 0);
			if (colourCode.getPairNumber() == 2) {
				assert (colourCode.getMajorColor().equals("White"));
				assert (colourCode.getMinorColor().equals("Orange"));
			}

		}

	}

	public static void main(String[] args) {
		Misaligned misaligned = new Misaligned();
		List<ColourCode> listOfColourCode = misaligned.generateColourCode();
		misaligned.printColorMap(listOfColourCode);
		misaligned.testColourCode(listOfColourCode);
		System.out.println("All is well (maybe!)");
	}
}
