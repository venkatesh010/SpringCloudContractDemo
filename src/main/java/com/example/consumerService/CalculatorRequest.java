package com.example.consumerService;

class CalculatorRequest {
	private int first;
	private int second;


	public CalculatorRequest(int first, int second) {
		this.first=first;
		this.second=second;
	}

	public CalculatorRequest() {
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
