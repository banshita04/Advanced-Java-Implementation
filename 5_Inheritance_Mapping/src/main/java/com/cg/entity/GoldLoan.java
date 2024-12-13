package com.cg.entity;

import javax.persistence.Entity;

@Entity
public class GoldLoan extends Loan {
	private float goldWeightInGrams;

	public float getGoldWeightInGrams() {
		return goldWeightInGrams;
	}

	public void setGoldWeightInGrams(float goldWeightInGrams) {
		this.goldWeightInGrams = goldWeightInGrams;
	}

}