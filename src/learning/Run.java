package learning;

public class Run {

	public static void main(String[] args) {
    dog myDog = new dog();
    System.out.println(myDog.ints);
    myDog.two();
    System.out.println(myDog.ints);
    myDog.ints = myDog.ints/2;
    myDog.supertwo();
    System.out.println(myDog.ints);
	}

}
