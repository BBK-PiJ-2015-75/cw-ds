package assignment2;

public class StackImpl extends AbstractStack {
	
	
	public StackImpl(List list) {
		super(list);
	}
	
	
	@Override
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	
	@Override
	public int size() {
		return internalList.size();
	}


	@Override
	public void push(Object item) {
		internalList.add(item);
	}

	
	/**
	 * Returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	@Override
	public ReturnObject top() {
		
		if(internalList.size() < 1 ) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnError1;
		}
		
		Object removeTop  = internalList.get(internalList.size()-1);  // get the list item at the top of the stack?
		ReturnObjectImpl objectTop = new ReturnObjectImpl(removeTop);
		return objectTop;
	}

	
	/**
	 * Returns the element at the top of the stack. The element is
	 * removed frmo the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	@Override
	public ReturnObject pop() {
		if(internalList.size() < 1 ) {
			ReturnObjectImpl returnError1 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return returnError1;
		}
		
		Object popOut  = internalList.get(internalList.size()-1); // save the element to an object
		internalList.remove(internalList.size()-1);					// remove the object
		ReturnObjectImpl returnPop = new ReturnObjectImpl(popOut);  // save the object as a ROImpl and return
		return returnPop;
	}

}
