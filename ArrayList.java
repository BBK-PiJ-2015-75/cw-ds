package assignment2;


public class ArrayList implements List{

	
	public Object[] array;
	public int counter;
	public int size;
	
	// constructor  100 elements
	public ArrayList(){
		size = 100;
		array = new Object[size];
		counter = 0;
		
	}

	
	@Override
	public boolean isEmpty() {
		if(counter == 0){
		return true;	
		}
		else 
			return false;
	}
	
	
	
	@Override
	public int size() {
		return counter;
	}

	// get the contents of element x in the index and returns it as an object
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
		Object o  = array[index];
		ReturnObjectImpl returnObj = new ReturnObjectImpl(o); 
		return returnObj;
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
		Object remove  = array[index];
		array[index] = null;
		for(int i = index; i< counter; i++){
			array[i] = array[i+1];
		}
		ReturnObjectImpl returnObj = new ReturnObjectImpl(remove);
		counter--;
		return returnObj;
	}

	@Override
	public ReturnObject add(int index, Object item) {
		if(counter >= size) {
			Object[] newArray = new Object[size * 2];	
			size = size *2;
			for(int count = 0 ; count < counter; count++){
				newArray[count] = array[count];
			}
			array = newArray;
		}
		
		if(index <0 ) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnError1;
		}
		
		if(index >= counter) {
			ReturnObjectImpl returnError2 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return returnError2;
		}

		// create the gap to add item
		else{
			for(int i = counter -1; i>= index; i--){
				array[i+1] = array[i];
			}
			array[index] = item;
		}
		
		ReturnObjectImpl returnObj = new ReturnObjectImpl(item);
		counter++;
		return returnObj;
		
	}

	@Override
	public ReturnObject add(Object item) {
		if(counter >= size) {
			Object[] newArray = new Object[size * 2];	
			size = size *2;
			for(int count = 0 ; count < counter; count++){
				newArray[count] = array[count];
			}
			array = newArray;
		}
		array[counter] = item;
		ReturnObjectImpl returnObj = new ReturnObjectImpl(item);
		counter++;
		return returnObj;
		
	}
	//print each item in the array in sequence
	public void printList(){
		for (int i=0; i<counter; i++){
			System.out.println(array[i].toString());
		}
	}
	

}
