class output{
	
	public static void main(String args[]){
		/*GenericStackTest<Integer> gstk = new GenericStackTest<>();
		gstk.push(36);
		System.out.println(gstk.poll());*/
		
		/*genericstack<String> gstk1 = new genericstack<>();
		gstk1.push("\"Hello\"");
		System.out.println(gstk1.poll());*/
		
		/*int i = IntStream.range(1, 5).reduce(2, (a,b) -> a+b);
		System.out.println(i);*/
		
		/*Map<Integer, Object> sampleMap = new TreeMap<Integer, Object>();
		sampleMap.put(1, null);
		sampleMap.put(5, null);
		sampleMap.put(3, null);
		sampleMap.put(2, null);
		sampleMap.put(4, null);
		System.out.println(sampleMap);*/
		
		/*List<String> collect = Stream.generate(() -> "DBOI").limit(10).collect(Collectors.toList());
		System.out.println(collect);*/
		
		/*List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(5,6));
		List<Integer> collect2 = listOfList.stream().flatMap((x) ->x.stream()).collect(Collectors.toList());
		System.out.println(collect2);*/
		
		/*try {
			int i, sum;
			sum = 10;
			for(i = -1; i<3; ++i){
				sum = (sum/i);
			}
		} catch (ArithmeticException e) {
			System.out.println(0);
		}
		System.out.println(sum);*/
		
		/*OptionalInt optionalInt = IntStream.range(1, 20).filter(v -> v%4 == 0).filter(v -> v<10).max();
		System.out.println(optionalInt.getAsInt());*/
	}
}