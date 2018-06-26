package topica1.model;

import java.io.Serializable;

public class KhachHang implements Serializable,Comparable<KhachHang>{
	private String name;
	private String ma;
	private String Number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public KhachHang(String name, String ma, String number) {
		super();
		this.name = name;
		this.ma = ma;
		Number = number;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		return this.name+"\t"+this.ma+"\t"+this.Number;
	}
	@Override
	public int compareTo(KhachHang o) {
		// TODO Auto-generated method stub
		return this.Number.compareToIgnoreCase(o.Number);
	}
	
	


	

}
