import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class FailSafeIterator {

	
	public static void main(String[] args) {/*

		Map<String,String> map= new HashMap<String,String>();
		map.put("Shradha", "Samantaray");
		map.put("Bimal", "Panigrahi");
		map.put("Sritam", "Samantaray");
		
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()){
			Map<String,String> map1=(Map<String, String>) itr.next();
			System.out.println("The values are :" +map.get(itr.next()));
			map.put("some", "exception");
		}
	
	*/
		CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<Integer>(new Integer[] {1,3,5,7});
		list.add(2);
		list.add(4);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Integer val=(Integer)itr.next();
			System.out.println(list);
			if(val==3){
				list.add(9);
			}
		}
	
	}

}
