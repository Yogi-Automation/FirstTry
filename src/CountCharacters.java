class CountCharacters{
		String myName1;
		String myName2;
	CountCharacters(String name1,String name2){
		this.myName1 = name1;
		this.myName2 = name2;
	}
	void countingNumber() {
		try
		{
		System.out.println("The given first name is :"+ myName1);
		System.out.println("The given second name is :"+ myName2);
		System.out.println();
		int count1 = 0;
		int count2 = 0;
		for(int index = 0;index<=myName1.length()-1;index++) {
			count1++;
		}
		for(int index = 0;index<=myName2.length()-1;index++) {
			count2++;
		}
		System.out.println("Number of the characters in first name : "+count1);
		System.out.println("Number of the characters in second name: "+count2);
		System.out.println();
		if(count1>count2) {
			System.out.println("First name "+myName1+" is bigger than "+"Second Name "+myName2);
			System.out.println("Difference between first name and second name is "+ (count1-count2) );
		}
		else {
			System.out.println("Second Name " +myName2+" is bigger than "+"First name "+myName1);
			System.out.println("Difference between second name and first name is "+ (count2-count1) );
		}
		}
		catch(NullPointerException e)
		{
			System.out.print("The value is not refered and null point exeception is occured");
		}
	}
}