package com.oop_design_patterns.builder;

public class Cat {
	
	private int i1;
	private int i2;
	
	@Override
	public String toString() {
		return "Cat{" +
				"i1=" + i1 +
				", i2=" + i2 +
				'}';
	}
	
	private Cat(CatBuilder builder){
		this.i1 = builder.i1;
		this.i2 = builder.i2;
	}
	
	public static class CatBuilder {
		
		private int i1;
		private int i2;
		
		public CatBuilder setI1(int i1){
			this.i1 = i1;
			return this;
		}
		
		public CatBuilder setI2(int i2){
			this.i2 = i2;
			return this;
		}
		
		public Cat build(){
			return new Cat(this);
		}
		
	}
	
	public static void main(String[] args) {
		Cat cat = new CatBuilder().setI1(1).setI2(2).build();
		System.out.println(cat);
		
	}
	
}
