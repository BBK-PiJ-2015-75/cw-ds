package assignment2;

public class ImprovedStackImpl implements ImprovedStack{
	
	public StackImpl stacker;
	
	public ImprovedStackImpl(List mList){
		stacker = new StackImpl(mList);
	}
	

	@Override
	public boolean isEmpty() {
		return stacker.isEmpty();
	}

	
	@Override
	public int size() {
		return stacker.size();
	}

	
	// add an item
	@Override
	public void push(Object item) {
		stacker.push(item);
		
	}

	@Override
	public ReturnObject top() {
		return stacker.top();
	}

	
	@Override
	public ReturnObject pop() {
		return stacker.pop();
	}

	
	
	/**
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */
	
	@Override
	public ImprovedStack reverse() {
		ArrayList arayStack = new ArrayList();
		ImprovedStackImpl newStacker = new ImprovedStackImpl(arayStack);
		while(!stacker.isEmpty()) {
			newStacker.push(stacker.pop());
		}
		return newStacker;
	}

	
	
	
	
	@Override
	public void remove(Object object) {
		int start;
		Object remove;
		Object check;
		
		for(start = 0; start <= stacker.size(); start++) {
			check = stacker.internalList.get(start);
			if(object.equals(check)) {
				remove = stacker.internalList.remove(start);
			}			
		}
	}
}
