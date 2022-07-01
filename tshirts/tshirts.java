

public class Tshirts {
     static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms >= 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

	public static void main(String[] args) {
		for (int size = 0; size < 38; size++) {
			assert (size(size) == "S");
		}
		for (int size = 38; size < 42; size++) {
			assert (size(38) == "M");
		}

		assert (size(42) == "L");
		assert (size(43) == "L");
		System.out.println("All is well");
	}
}
