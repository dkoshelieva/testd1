package package4_HW4;

public abstract class Bird {
	private boolean feathers;
	private boolean layeggs;

	public boolean getFeathers() {
		return feathers;
	}

	public boolean getLayeggs() {
		return layeggs;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public void setLayEggs(boolean layeggs) {
		this.layeggs = layeggs;
	}

	public String toString() {
		return "Bird feathers=" + feathers + ", layEggs=" + layeggs;
	}
}