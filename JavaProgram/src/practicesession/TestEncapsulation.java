package practicesession;

public class TestEncapsulation {

	public static void main(String args[]) {

		Account acc = new Account();
		acc.setAcc_no(1345679965487L);
		acc.setAmount(500000f);
		acc.setEmail("Pravin.Kokadwar@gamil.com");
		acc.setName("Pravin Kokadwar");

		System.out.println(acc.getAcct_no() + "=====" + acc.getAmount() + "======" + acc.getEmail() + "==========" + acc.getName());

	}

}
