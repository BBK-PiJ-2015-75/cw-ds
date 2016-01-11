package assignment2;

public class SampleableListImpl implements SampleableList {
	
	ArrayList list;
	

	public SampleableListImpl()
	{
		list = new ArrayList();
	}
	
	
	@Override			
	public boolean isEmpty(){
		return list.isEmpty();
	}
	

	@Override
	public int size() {
	return list.size();
	}

	
	
	@Override
	public ReturnObject get(int index) {
		return list.get(index);
	}


	
	@Override
	public ReturnObject remove(int index) {
		return list.remove(index);
	}

	
	@Override
	public ReturnObject add(int index, Object item) {
		return list.add(index, item);
	}

	
	@Override
	public ReturnObject add(Object item) {
		return list.add(item);
	}


	/**
	 * Returns a list containing the first, third, fifth...
	 * items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
	 */
	@Override
	public SampleableList sample(){
		
		int header = 0;
		ArrayList newArray = new ArrayList();
		for(header = 0; header < list.size(); header += 2){
			newArray.add(list.get(header));
		}
		
		SampleableListImpl listReturned = new SampleableListImpl();
		listReturned.list = newArray;
		return listReturned;
		
		}
}