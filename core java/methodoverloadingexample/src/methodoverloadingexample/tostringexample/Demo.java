package methodoverloadingexample.tostringexample;

public class Demo {

	private String message;
	
	public Demo() {
		this.message="Hi Welcome";
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Demo [message=" + message + "]";
	}
	/**
	@Override
	public void  toString() {
		//return "1112";
	}**/
	
	
	

}
