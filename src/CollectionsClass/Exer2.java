package CollectionsClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exer2 {

	public static void main(String[] args) {
		ArrayList sheetal = new ArrayList();
		sheetal.add("Sheetal");
		sheetal.add("8208289517");
		sheetal.add("sheetal.r.sakhare@gmail.com");
		
		ArrayList ravi = new ArrayList();
		ravi.add("Ravi");
		ravi.add("88880432");
		ravi.add("ravi.sakhare@gmail.com");
		
		ArrayList simran = new ArrayList();
		simran.add("Simran");
		simran.add("88880431");
		simran.add("Simran.sakhare@gmail.com");
		
		HashMap<Integer,ArrayList> hm= new HashMap();
		
		hm.put(1, sheetal);
		hm.put(2, ravi);
		hm.put(3, simran);
		System.out.println(hm);


	}

}
