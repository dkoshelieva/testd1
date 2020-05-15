package package4_HW4;

public class Eagle extends FlyingBird {

	public Eagle(boolean feathers, boolean layeggs) {
		setFeathers(feathers);
		setLayEggs(layeggs);
	}

	@Override
	public String toString() {
		return "Eagle: has feathers = " + getFeathers() + ", lay eggs = " + getLayeggs() + ", can fly = " + getcanfly();
	}
}
