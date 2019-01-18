package insurance_software;


public class engine extends vehicles {
	final String validity;
	String policy;

	public engine(String owner, String model, int tyre, String validity) {
		super(owner, model, tyre);
		this.validity = validity;
		System.out.println(getset_policy() +  "      " +    validity);
		
	}

	public String getset_policy() {
		if (this.get_tyre() == 4) {
			this.policy = "comprehensive";
		} else {
			this.policy = "third_party";
		}
		return (this.policy);

	}

	private int validity_checker(String vld) {
		if (vld.equals("valid")) {
			return (0);
		} else {
			return (1);
		}

	}

	public void settlement(vehicles other) {
		int[] damages_both = damages();
		
		float me = damages_both[0];
		float othr = damages_both[1];
		if (validity_checker(this.validity) == 0) {
			if(getset_policy().equals("comprehensive")) {
				me=(me*40) /100;
				othr=(20 * othr)/100;
						}
			else if(getset_policy().equals("third_party")) {
				me=(me*90) /100;
				othr=( othr)/2;
						}
		System.out.println();
		System.out.println();
		System.out.println("Settelment details");
	
		System.out.println();
		System.out.println("vehicle1 damage status, after settlement" + "  " + " : " + me);
		System.out.println("vehicle2 damage status, after settlement" + "  " + " : " + othr);

		}
		else {
		System.out.println("Policy expired");
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
