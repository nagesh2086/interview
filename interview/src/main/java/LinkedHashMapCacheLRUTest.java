import java.util.LinkedHashMap;

public class LinkedHashMapCacheLRUTest {

	public static void main(String[] args) {
		Cache lhm = new Cache(7, 0.75f, true);
		System.out.println(lhm.size());
		//Cache lhm = (Cache) new LinkedHashMap<Integer, Integer>(7, 0.75f, true);
		lhm.put(0, 0);
		lhm.put(1, 1);
		lhm.put(2, 4);
		lhm.put(3, 9);
		lhm.put(4, 16);
		lhm.put(5, 25);
		lhm.put(6, 36);
		
		System.out.println(lhm);
		lhm.get(0);
		System.out.println(lhm);
		lhm.get(1);
		lhm.get(2);
		System.out.println(lhm);
		lhm.put(7, 49);
		System.out.println(lhm);
		lhm.put(8, 64);
		lhm.put(9, 81);
		System.out.println(lhm);
		System.out.println(lhm.size());
	}

	static class Cache extends LinkedHashMap<Integer, Integer>{
		/**
		 * 
		 */
		private static final long serialVersionUID = 2908124301813668111L;
		
		Cache(int initialCapacity, float loadFactor, boolean accessOrder){
			super(initialCapacity, loadFactor, accessOrder);
		}
		
		private final int size = 7;
		
		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
			return size() > size;
		}
	}
}
