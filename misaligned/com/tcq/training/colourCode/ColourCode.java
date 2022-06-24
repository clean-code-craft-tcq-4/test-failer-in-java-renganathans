package com.tcq.training.colourCode;

public class ColourCode {
	private int pairNumber;
	private String majorColor;
	private String minorColor;
	
	private ColourCode(int pairNumber, String minorColor, String majorColor) {
		this.pairNumber = pairNumber;
		this.minorColor = minorColor;
		this.majorColor = majorColor;
	}

	public int getPairNumber() {
		return pairNumber;
	}

	public void setPairNumber(int pairNumber) {
		this.pairNumber = pairNumber;
	}

	public String getMajorColor() {
		return majorColor;
	}

	public void setMajorColor(String majorColor) {
		this.majorColor = majorColor;
	}

	public String getMinorColor() {
		return minorColor;
	}

	public void setMinorColor(String minorColor) {
		this.minorColor = minorColor;
	}
	
	public static class Builder {
		private int pairNumber;
		private String majorColor;
		private String minorColor;

		public Builder setPairNumber(int pairNumber) {
			this.pairNumber = pairNumber;
			return this;
		}

		public Builder setMajorColor(String majorColor) {
			this.majorColor = majorColor;
			return this;
		}

		public Builder setMinorColor(String minorColor) {
			this.minorColor = minorColor;
			return this;
		}
		
		public ColourCode build(){
			return new ColourCode(pairNumber,minorColor,majorColor);
		}
	}

	
}
