package concretes;

public class LetterUS extends BaseAlbum{

	private static final double LETTERUS_FORMAT_PRICE = 24.99;
	public LetterUS(BookColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateCost() {
		return LETTERUS_FORMAT_PRICE;
		
	}

}
