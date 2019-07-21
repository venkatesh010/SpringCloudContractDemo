package com.example.providerService;

public class CalculatorRequest {
	private int first;
	private int second;

	public CalculatorRequest() {
	}

	public CalculatorRequest(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
