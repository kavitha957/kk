package kk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class subset {
	String a1 = "computer";
	String a2 = "computer";

	public boolean isSubset(ArrayList<String> a1, ArrayList<String> a2) {
	   Set<String> s1 = new HashSet(a1);
	   Set<String> s2 = new HashSet(a2);

	   return s1.containsAll(s2);
	}
}
