package assignment2;


public class LinkedList implements List{
	


	public Node first;
	public Node here;
	public int counter;
	
	public LinkedList (){
		counter = 0;
	}
		
	
	@Override
	public boolean isEmpty() {
		if(first == null)
			return true;
		else
			return false;
	}


	@Override
	public int size() {
		return counter;
	}
	
	
	@Override
	public ReturnObject get(int index) {
		if(index <0 ) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnError1;
		}
		if(index >= counter) {
			ReturnObjectImpl returnError2 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnError2;
		}
		else if (index == 0)
		{
			return first.data;
		}
		
		else {
			Node current = first;
			for(int count = 1; count < index; count++ ){
				current = current.next;
			}
			ReturnObjectImpl result = current.next.data;
			return result;
		}
		
		}
			
		
	@Override
	public ReturnObject remove(int index) {

		if(index <0 ) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnError1;
		}
		if(index >= counter) {
			ReturnObjectImpl returnError2 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnError2;
		}
		else if (index == 0)
		{
			ReturnObjectImpl removeObj = new ReturnObjectImpl(first.data);
			first = first.next;
			counter--;
			return removeObj;
		}
		
		else {
			Node current = first;
			for(int count = 1; count < index; count++ ){
				current = current.next;
			}
			ReturnObjectImpl removeObj2 = new ReturnObjectImpl(current.next.data);
			
			current.next = current.next.next;
			counter--;
			return removeObj2;
		}
		
		}
		
	
	@Override
	public ReturnObject add(int index, Object item) {

		if(index <0 ) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnError1;
		}
		if(index > counter) {
			ReturnObjectImpl returnError2 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnError2;
		}
		
		else if (index == 0)
		{
			ReturnObjectImpl addObj1 = new ReturnObjectImpl(item);
			Node newNode = new Node (addObj1, first); 
			first = newNode;
			counter++;
			return addObj1;
		}
		
		else {
			Node current = first;
			for(int count = 1; count < index; count++ ){
				current = current.next;
			}			
			ReturnObjectImpl addObj2 = new ReturnObjectImpl(item);
			Node newNode = new Node (addObj2, current.next);
			current.next = newNode;
			counter++;
			return addObj2;
		}

	}

	
	
	@Override
	public ReturnObject add(Object item) {
		return add(counter, item);
	
	}
	
	// print each element in the LL.
	public void printList(){
		Node curr = first;
		while (curr != null) {
			System.out.println(curr.data.toString());
			curr = curr.next;
			
		}
	}

}
