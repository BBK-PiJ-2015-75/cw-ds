package assignment2;


public class ReturnObjectImpl implements ReturnObject{

	public Object object;
	public ErrorMessage error;
	
	public ReturnObjectImpl (Object o){
		
		this.object = o;
	}
	
	public ReturnObjectImpl (ErrorMessage m) {
		
		this.error = m;
	}
	
	
	
	@Override
	public boolean hasError() {
		if(error == null || error == ErrorMessage.NO_ERROR){
			return false;
		}
		else 
			return true;	
	}

	
	@Override
	public ErrorMessage getError() {
		return error;
	}

	
	@Override
	public Object getReturnValue() {
		return object;
		
	}
	
	
	public void setObject(Object name){
		object = name;
		
	}
	
	public void setErrorMessage(ErrorMessage error){
		this.error = error;
	}

}
