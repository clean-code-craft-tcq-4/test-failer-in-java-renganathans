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
		int i = 1;
		for (ColourCode colourCode : listOfColourCode) {

			assertColourCode(i, colourCode);
			i++;
		}

	}

	public void assertColourCode(int key, ColourCode colourCode) {
		switch (key) {
		case 1:
			assert (colourCode.getPairNumber() == 1);
			assert (colourCode.getMajorColor().equals("White"));
			assert (colourCode.getMinorColor().equals("Blue"));
			break;
		case 2:
			assert (colourCode.getPairNumber() == 2);
			assert (colourCode.getMajorColor().equals("White"));
			assert (colourCode.getMinorColor().equals("Orange"));
			break;
		case 3:
			assert (colourCode.getPairNumber() == 3);
			assert (colourCode.getMajorColor().equals("White"));
			assert (colourCode.getMinorColor().equals("Green"));
			break;
		case 4:
			assert (colourCode.getPairNumber() == 4);
			assert (colourCode.getMajorColor().equals("White"));
			assert (colourCode.getMinorColor().equals("Brown"));
			break;
		case 5:
			assert (colourCode.getPairNumber() == 5);
			assert (colourCode.getMajorColor().equals("White"));
			assert (colourCode.getMinorColor().equals("Slate"));
			break;
		case 6:
			assert (colourCode.getPairNumber() == 6);
			assert (colourCode.getMajorColor().equals("Red"));
			assert (colourCode.getMinorColor().equals("Blue"));
			break;
		case 7:
			assert (colourCode.getPairNumber() == 7);
			assert (colourCode.getMajorColor().equals("Red"));
			assert (colourCode.getMinorColor().equals("Orange"));
			break;
		case 8:
			assert (colourCode.getPairNumber() == 8);
			assert (colourCode.getMajorColor().equals("Red"));
			assert (colourCode.getMinorColor().equals("Green"));
			break;
		case 9:
			assert (colourCode.getPairNumber() == 9);
			assert (colourCode.getMajorColor().equals("Red"));
			assert (colourCode.getMinorColor().equals("Brown"));
			break;
		case 10:
			assert (colourCode.getPairNumber() == 10);
			assert (colourCode.getMajorColor().equals("Red"));
			assert (colourCode.getMinorColor().equals("Slate"));
			break;
		case 11:
			assert (colourCode.getPairNumber() == 11);
			assert (colourCode.getMajorColor().equals("Black"));
			assert (colourCode.getMinorColor().equals("Blue"));
			break;
		case 12:
			assert (colourCode.getPairNumber() == 12);
			assert (colourCode.getMajorColor().equals("Black"));
			assert (colourCode.getMinorColor().equals("Orange"));
			break;
		case 13:
			assert (colourCode.getPairNumber() == 13);
			assert (colourCode.getMajorColor().equals("Black"));
			assert (colourCode.getMinorColor().equals("Green"));
			break;
		case 14:
			assert (colourCode.getPairNumber() == 14);
			assert (colourCode.getMajorColor().equals("Black"));
			assert (colourCode.getMinorColor().equals("Brown"));
			break;
		case 15:
			assert (colourCode.getPairNumber() == 15);
			assert (colourCode.getMajorColor().equals("Black"));
			assert (colourCode.getMinorColor().equals("Slate"));
			break;
		case 16:
			assert (colourCode.getPairNumber() == 16);
			assert (colourCode.getMajorColor().equals("Yellow"));
			assert (colourCode.getMinorColor().equals("Blue"));
			break;
		case 17:
			assert (colourCode.getPairNumber() == 17);
			assert (colourCode.getMajorColor().equals("Yellow"));
			assert (colourCode.getMinorColor().equals("Orange"));
			break;
		case 18:
			assert (colourCode.getPairNumber() == 18);
			assert (colourCode.getMajorColor().equals("Yellow"));
			assert (colourCode.getMinorColor().equals("Green"));
			break;
		case 19:
			assert (colourCode.getPairNumber() == 19);
			assert (colourCode.getMajorColor().equals("Yellow"));
			assert (colourCode.getMinorColor().equals("Brown"));
			break;
		case 20:
			assert (colourCode.getPairNumber() == 20);
			assert (colourCode.getMajorColor().equals("Yellow"));
			assert (colourCode.getMinorColor().equals("Slate"));
			break;
		case 21:
			assert (colourCode.getPairNumber() == 21);
			assert (colourCode.getMajorColor().equals("Violet"));
			assert (colourCode.getMinorColor().equals("Blue"));
			break;
		case 22:
			assert (colourCode.getPairNumber() == 22);
			assert (colourCode.getMajorColor().equals("Violet"));
			assert (colourCode.getMinorColor().equals("Blue"));
			break;
		case 23:
			assert (colourCode.getPairNumber() == 23);
			assert (colourCode.getMajorColor().equals("Violet"));
			assert (colourCode.getMinorColor().equals("Orange"));
			break;
		case 24:
			assert (colourCode.getPairNumber() == 24);
			assert (colourCode.getMajorColor().equals("Violet"));
			assert (colourCode.getMinorColor().equals("Brown"));
			break;
		case 25:
			assert (colourCode.getPairNumber() == 25);
			assert (colourCode.getMajorColor().equals("Violet"));
			assert (colourCode.getMinorColor().equals("Slate"));
			break;

		default:
			break;
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
