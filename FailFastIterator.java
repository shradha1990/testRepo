import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FailFastIterator {


	public static void main(String[] args) {
		Map<String,String> map= new HashMap<String,String>();
		map.put("Shradha", "Samantaray");
		map.put("Bimal", "Panigrahi");
		map.put("Sritam", "Samantaray");
		
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()){
			System.out.println("The values are :" +map.get(itr.next()));
			map.put("some", "exception");
		}
	}

}
