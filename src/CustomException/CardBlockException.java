package CustomException;

public class CardBlockException extends RuntimeException{
	private String msg="Your Card is Blocked. Please Contact Branch";
	public CardBlockException() {
		
	}
	public CardBlockException(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		
		return msg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
}
