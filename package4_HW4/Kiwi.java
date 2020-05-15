package package4_HW4;

public class Kiwi extends NonflyingBird {
	public Kiwi(boolean feathers, boolean layeggs) {
		setFeathers(feathers);
		setLayEggs(layeggs);
	}

	@Override
	public String toString() {
		return "Kiwi: has feathers = " + getFeathers() + ", lay eggs = " + getLayeggs() + ", can fly = " + getcanfly();
	}
}
