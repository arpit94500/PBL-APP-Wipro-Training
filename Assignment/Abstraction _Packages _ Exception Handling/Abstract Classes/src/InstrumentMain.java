

public class InstrumentMain {

	public static void main(String[] args) {
		Instrument i[] = new Instrument[10];
		i[0] = new Piano();
		i[0].play();
		i[1] = new Flute();
		i[1].play();
		i[2] = new Guitar();
		i[2].play();
		i[3] = new Piano();
		i[3].play();
		i[4] = new Flute();
		i[4].play();
		i[5] = new Guitar();
		i[5].play();
		i[6] = new Piano();
		i[6].play();
		i[7] = new Flute();
		i[7].play();
		i[8] = new Guitar();
		i[8].play();
		i[9] = new Piano();
		i[9].play();
		
		System.out.println(i[9] instanceof Instrument);
		System.out.println(i[0] instanceof Instrument);
		
	}

}
