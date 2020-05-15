package package4_HW4;

public class Penguin extends NonflyingBird {
	public Penguin(boolean feathers, boolean layeggs) {
		setFeathers(feathers);
		setLayEggs(layeggs);
	}

	@Override
	public String toString() {
		return "Penguin: has feathers = " + getFeathers() + ", lay eggs = " + getLayeggs() + ", can fly = "
				+ getcanfly();
	}
}
