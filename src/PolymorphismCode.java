class PolymorphismCode{													//Overriding
	void properties() {
		System.out.println("Mobile phone properties ");
	}
}
class Male extends PolymorphismCode{
	void properties() {
		System.out.println("This page shows male cloths");
	}
}
class Women extends PolymorphismCode{
	void properties() {
		System.out.println("This page shows Women cloths");
	}
}
class Kids extends PolymorphismCode{
	void properties() {
		System.out.println("This page shows Kids cloths");
	}
}
class SizeSelection{														// Overloading
	void size(int aSize) {
		System.out.println("The selected size is "+aSize);
	}
	void size(String bSize) {
		System.out.println("The selected size is "+bSize);
	}
}

