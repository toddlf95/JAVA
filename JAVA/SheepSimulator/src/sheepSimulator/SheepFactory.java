package sheepSimulator;

public class SheepFactory {

	private static SheepFactory Instance = null;

	private SheepFactory() {
	}

	public static SheepFactory getInstance() {
		if (Instance == null)
			Instance = new SheepFactory();

		return Instance;
	}

	public Sheep makeSheep() {
		return new Sheep(); // 이거저저 추가하기
	}

	public Sheep makeMaleSheep() {
		return new Sheep(SheepSex.valueOf("MALE").ordinal());
	}

	public Sheep makeFemaleSheep() {
		return new Sheep(SheepSex.valueOf("FEMALE").ordinal());
	}
}
