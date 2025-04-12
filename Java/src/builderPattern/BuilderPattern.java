package builderPattern;

public class BuilderPattern {

	public static void main(String[] args) {
		Movies mov = new Movies();
		mov.setId(2).setName("Puspha").setRating(4);
		System.out.println(mov);

	}

}
