package com.xworkz.Perfume.dto;

public class PerfumeDTO {
	private String name;
	private double price;
	private String flavour;
	private int quntity;

	public PerfumeDTO() {
		super();
		this.name = name;
		this.price = price;
		this.flavour = flavour;
		this.quntity = quntity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}

	@Override
	public String toString() {
		System.out.println("invoked toString");
		return "PurfumeDTO [name=" + name + ", price=" + price + ", flavour=" + flavour + ", quntity=" + quntity
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getFlaour()=" + getFlavour()
				+ ", getQuntity()=" + getQuntity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
