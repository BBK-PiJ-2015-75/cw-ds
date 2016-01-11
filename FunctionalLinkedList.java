package assignment2;

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	@Override
	public ReturnObject head() {
		if (first == null) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnError1;
		}
		else {
			return first.data;
		}
	}

	
	
	@Override
	public FunctionalList rest() {
		
		FunctionalLinkedList list = new FunctionalLinkedList();
		
		for (int data = 1; data < counter; data++) {
			list.add(get(data));
		}
		return list;
	}
	
	
	public void printRest() {
		FunctionalList rest = rest();
		
		for(int i = 0 ; i <counter -1 ; i++) {
			
			System.out.println(rest.get(i).toString());
		}	
	}
}
