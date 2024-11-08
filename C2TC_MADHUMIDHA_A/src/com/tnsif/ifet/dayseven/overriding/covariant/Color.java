package com.tnsif.ifet.dayseven.overriding.covariant;

class Color {
	protected Color getColor() {
		Color s = new Color();
		return s;
	}
}
class Red extends Color {
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}
