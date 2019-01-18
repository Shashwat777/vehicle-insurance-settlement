package insurance_software;
import java.util.Random;

public class vehicles {
	 String  owner ;
	 String model;
	 int tyre;
	 
	
	vehicles(String owner ,String model , int tyre ){
		this.owner=owner;
		this.model=model;
		this.tyre=tyre;
		System.out.print(this.model + "            " +   this.owner + "             " +   this.tyre + "                  ");
	}
	public String get_owner() {
		return(this.owner);
	}
	public String get_model() {
		return (this.model);
		
	}
	public int get_tyre() {
		return (this.tyre);
	}
	public String getset_policy() {
		return ("No policy");
	}
	
    public  int[] damages() {
		  int[] damages_both=new int[2];
		  Random rand = new Random();
		  int self=rand.nextInt();
		  if(self<0) {
			  self=self*(-1);
		  }
		  damages_both[0]=self/1000;
		  
		  int oncoming=rand.nextInt() /1000;
		  if(oncoming<0) {
			  oncoming=oncoming*(-1);
		  }
		  damages_both[1]=oncoming;
		  System.out.println("Damages awarded to vehicle1:"+ " " + damages_both[0] );
		  System.out.println("Damages awarded to vehicle2:"+ " " + damages_both[1]);

		  return(damages_both);
	}

}
