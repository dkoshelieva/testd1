package package4_HW4;

public class Swallow extends FlyingBird {
	public Swallow(boolean feathers, boolean layeggs) {
		setFeathers(feathers);
		setLayEggs(layeggs);
	}

	@Override
	public String toString() {
		return "Swallow: has feathers = " + getFeathers() + ", lay eggs = " + getLayeggs() + ", can fly = "
				+ getcanfly();
	}

}
