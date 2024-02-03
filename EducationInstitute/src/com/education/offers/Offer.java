package com.education.offers;

public class Offer {
	private String offertext;

	public Offer(String offertext) {
		super();
		this.offertext = offertext;
	}

	public String getOffertext() {
		return offertext;
	}

	@Override
	public String toString() {
		return "Offer [offertext=" + offertext + "]";
	}
	
	
}
