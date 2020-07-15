package com.gleidson.study;

import java.util.List;

public class SweetCreator {

	private List<SweetProducer> sweetProducer;
	SweetCreator(List<SweetProducer> sweetProducer) {
		this.sweetProducer = sweetProducer;
	}
	public void createSweets() {
		sweetProducer.forEach(sweet -> sweet.produceSweet());
	}
}
