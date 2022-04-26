package exceptionhandlingexample.exceptions;

public class AdmissionCodeException extends Exception {

	private String code = "";

	public AdmissionCodeException() {

	}

	public AdmissionCodeException(String code) {
		this.code = this.code + code;
	}
	
	@Override
	public String toString() {
		return code;
	}

}
