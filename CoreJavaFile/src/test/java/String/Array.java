package String;

public class Array {
	public static void main(String[] args) {
		String[] headerChildQuoteGrid = { "Vendor Name", "Vendor Service Description/ Alternative",
				"Total One Time Cost", "Recurring Cost", "Child Quote Step", "Award Status", "Last Updated Date" };
		String[] Value = { "Vendor Name", "Vendor Service Description/ Alternative", "Total One Time Cost",
				"Recurring Cost", "Child Quote Step", "Award Status", "Last Updated Date" };
		m2(headerChildQuoteGrid, Value);
	}

	public static void m2(String[] v1, String[] v2) {

		for (int i = 0; i < v1.length; i++) {
			if (v1[i].equals(v2[i])) {
				System.out.println(v1[i] + "........" + v2[i]);
			}
		}
	}
}
