package com.hafiz.creational;

public class SingletonPatternWithLazyInitialization {
	private static SingletonPatternWithLazyInitialization instance = null;
	private SingletonPatternWithLazyInitialization(){}
	
	public static synchronized SingletonPatternWithLazyInitialization getInstance(){
		if(instance == null){
			instance = new SingletonPatternWithLazyInitialization();
		}
		return instance;
	}
}
