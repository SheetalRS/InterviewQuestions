package CustomException;
	
import java.util.Scanner;

public class ATM {
	private int pin=1234;
	private int balance=50000;
	private boolean ValidatePin(int pin) {
		if (this.pin==pin) {
			return true;
		} else {
			return false;
		}

	}
	public void Withdraw(int pin,int amt){
		int attempt=1;
		do {
		if (ValidatePin(pin)) {
			balance=balance-amt;
			System.out.println("Your Balance is "+ balance);
			break;
			} else {
			System.out.println("Invalid Pin.Please Try again ");
			pin=new Scanner(System.in).nextInt();
			attempt++;
			if (attempt>3) {
				//throw new ArrayIndexOutOfBoundsException();
				//throw new CardBlockException();
				throw new CardBlockException("We are on lunch break");
			} 
		}
		}while(attempt<=3);
	}
	public static void main(String[] args) {
		ATM a=new ATM();
		a.Withdraw(1111, 10000);

	}

}
