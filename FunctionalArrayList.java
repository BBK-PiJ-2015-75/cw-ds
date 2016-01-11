package assignment2;

public class FunctionalArrayList extends ArrayList implements FunctionalList{

	
	
	@Override
	public ReturnObject head() {
		int header = 0;
		if(counter == 0) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return returnError1;
		}
		else {
			Object o  = array[header];
			ReturnObjectImpl returnObj = new ReturnObjectImpl(o);
			return returnObj;
		}	
	}

	@Override
	public FunctionalList rest() {
		if(counter < 2) {
		FunctionalArrayList listReturned = new FunctionalArrayList();	
		return listReturned;
		}
		

		int header = 0;
		Object[] newArray = new Object[counter -1];
		for(header = 1; header < counter; header ++){
			Object o  = array[header];
			newArray[header-1] = o;
		}
		
		FunctionalArrayList listReturned = new FunctionalArrayList();
		listReturned.array = newArray;
		return listReturned;
	}

	
	public void printRest() {
		FunctionalArrayList rest = (FunctionalArrayList) rest();
		
		for(int i = 0 ; i <rest.array.length; i++) {
			
			System.out.println(rest.get(i).toString());
		}
		
	}
	
	
}
