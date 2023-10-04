package com.practice.springcore;

public class Contra implements Game {

	@Override
	public void up() {
		System.out.println("Contra up");
	}

	@Override
	public void down() {
		System.out.println("Contra down");
	}

	@Override
	public void left() {
		System.out.println("Contra left");
	}

	@Override
	public void right() {
		System.out.println("Contra right");
	}

}
