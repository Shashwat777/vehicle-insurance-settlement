package insurance_software;

public class insurance_software {
	private static void print_detail(vehicles v1 , vehicles v2) {
		System.out.println("Vehicle 1  :" + v1.model +" " +v1.owner + "  collided with vehicle 2  "+  v2.model + " " + v2.owner );
		
	}
    private static void getheader() {
    	System.out.println("Model           Owner           Type            Insurance Type          Policy validity   ");
    	System.out.println();
    	System.out.println();
    	
    	
    	
    }

	public static void main(String[] args) {
		getheader();
		engine safari=new engine("abc","xyz", 4 , "valid");
		non_engine tonga=new non_engine("ram","desi", 4 );
		engine jaguar=new engine("shawn","fg56", 4 , "invalid");
		engine Harley_davidson=new engine("biker_harley","G30", 2 , "valid");
		engine vespa=new engine("driver_vespa","VXl 125", 2 , "invalid");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("STIMULATION");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		print_detail(jaguar , tonga);
		jaguar.settlement(tonga);
		print_detail(jaguar , safari);
		jaguar.settlement(safari);
		print_detail(tonga , safari);
		tonga.settelment(safari);
		safari.settlement(tonga);
		print_detail(safari , jaguar);
		safari.settlement(jaguar);
		print_detail(Harley_davidson , jaguar);
		Harley_davidson.settlement(jaguar);
		print_detail(Harley_davidson , tonga);
		Harley_davidson.settlement(tonga);
		print_detail(Harley_davidson , safari);
		Harley_davidson.settlement(safari);
		print_detail(jaguar,Harley_davidson );
		jaguar.settlement(Harley_davidson);
		print_detail(safari,Harley_davidson );
	    safari.settlement(Harley_davidson);
	    print_detail(tonga,Harley_davidson );
	    tonga.settelment(Harley_davidson);
	    print_detail(vespa,Harley_davidson );
	    vespa.settlement(Harley_davidson);
	    print_detail(vespa,tonga );
	    vespa.settlement(tonga);
	    print_detail(vespa,jaguar );
	    vespa.settlement(jaguar);
	    print_detail(vespa,safari);
	    vespa.settlement(safari);
	    print_detail(tonga ,vespa );
	    tonga.settelment(vespa);
	    print_detail(Harley_davidson,vespa );
	    Harley_davidson.settlement(vespa);
	    print_detail(jaguar,vespa );
		jaguar.settlement(vespa);
		print_detail(safari,vespa );
	    safari.settlement(vespa);
	    
		
		
		

	}

}
