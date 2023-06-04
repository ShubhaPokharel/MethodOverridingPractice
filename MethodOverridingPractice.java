class MethodOverridingPractice{
	
	 double powerBill(int numberOfUnits, double amountPerUnit){

		return 19.02;
	}
}

class Child extends MethodOverridingPractice{
	double powerBill(int a, double b){

		double totalAmount;
		totalAmount = a * b;
		return totalAmount;
	}

	static char travel(String name,int age){
		if(age >= 10){
			return 'A';
		}
		else{
			return 'B';
		}
	}


	public static void main(String[] args){
		MethodOverridingPractice m = new MethodOverridingPractice();
		double equal = m.powerBill(23, 53.222);
		System.out.println("Hey....... " + equal);

		System.out.println("***************************************************");

		Child c = new Child();
		double finalAmount = c.powerBill(31,5.43);
		System.out.println("Your final Amount : "+ finalAmount);

		double finalAmount2 = c.powerBill(100,53.00);
		System.out.println("Your final Amount : "+ finalAmount2);


		double finalAmount3 = c.powerBill(24,25.32332);
		System.out.println("Your final Amount : "+ finalAmount3);


		double finalAmount4 = c.powerBill(0,2424.1);
		System.out.println("Your final Amount : "+ finalAmount4);


		System.out.println("***************************************************");

		char travelAge = Child.travel("Shubha",30);
		System.out.println("Your travel criteria is...."+travelAge);


		char travelAge2 = Child.travel("dasF",0);
		System.out.println("Your travel criteria is...."+travelAge2);

		char travelAge3 = Child.travel("DSG",-224);
		System.out.println("Your travel criteria is...."+travelAge3);


		char travelAge4 = Child.travel("DSAF",10);
		System.out.println("Your travel criteria is...."+travelAge4);
		
	}
}
