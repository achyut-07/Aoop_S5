package com.IspWorkerManagement;

public class Human implements Worker,Eater{

	@Override
	public void Eat() {
		System.out.println("Human is eating for energy");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Human is peroforming his tasks i.e working");
	}

}
