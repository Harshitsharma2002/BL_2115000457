public class Discount{
	public static void main(String args[]){
		int fees = 125000;
		int discountPercentage = 10;
		int discount = (fees/10);
		int discountedFees = fees - discount;
	System.out.println("The discount amount is INR " + discount  + " and final discounted fee is INR " + discountedFees );
}
}
