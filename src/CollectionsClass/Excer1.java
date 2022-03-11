package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Excer1 {

	public static void main(String[] args) {
		ArrayList stateCode = new ArrayList();
		stateCode.add("MH");
		stateCode.add("AP");
		stateCode.add("UP");
		stateCode.add("TN");
		stateCode.add("MP");
		stateCode.add("UK");

		ArrayList states = new ArrayList();
		states.add("Maharashtra");
		states.add("Andhra Pradesh");
		states.add("Uttar Pradesh");
		states.add("Tamilnadu");
		states.add("Madhya Pradesh");
		states.add("Uttarakhand");

		HashMap<ArrayList, ArrayList> india = new HashMap();

		india.put(stateCode, states);
		System.out.println(india);

	}

}
