package abstractionConcepts;

public class TestBank {

	public static void main(String args[]) {

		HDFCBank hb = new HDFCBank();
		hb.Credit();
		hb.Debit();
		hb.loan();
		hb.funds();

		
		Bank b = new HDFCBank();
		b.Credit();
		b.Debit();
		b.loan();

	}

}
