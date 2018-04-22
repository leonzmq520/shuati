package hackrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Byt {

	public void saveHeaders() {
		Map<String, Set<String>> csvHeaders = new HashMap<>();
		System.out.println("___________initial Map____________");
		Set<String> headersSet0 = new HashSet<>();
		Set<String> headersSet1 = new HashSet<>();
		Set<String> headersSet2 = new HashSet<>();

		headersSet0.addAll(Arrays.asList("s", "l", "lsl"));
		headersSet1.addAll(Arrays.asList("x", "l", "xsl"));
		headersSet2.addAll(Arrays.asList("", "l", ""));

		csvHeaders.put("001", headersSet0);
		csvHeaders.put("002", headersSet1);
		csvHeaders.put("003", headersSet2);

		Iterator<Entry<String, Set<String>>> csvApplicationsIterator = csvHeaders.entrySet().iterator();
		while (csvApplicationsIterator.hasNext()) {
			Entry<String, Set<String>> csvApplication = csvApplicationsIterator.next();
			System.out.println("key : " + csvApplication.getKey());
			System.out.println("values : " + csvApplication.getValue());
			Iterator<String> headersIterator = csvApplication.getValue().iterator();
			while (headersIterator.hasNext()) {
				String header = headersIterator.next();
				System.out.println("value : " + header);
			}
			System.out.println("___________________________________");
		}
	}

	public static void main(String[] args) {
		Byt byt = new Byt();
		byt.saveHeaders();
	}
}
