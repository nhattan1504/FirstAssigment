package TestChucNang;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import topica.io.SerialPactory;
import topica1.model.KhachHang;

public class Testest {
	static ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
public static void Menu()
{
	int choose;
	System.out.println("Menu");
	System.out.println("=======================================");
	System.out.println("1.Nhập khách hàng");
	System.out.println("2.Xuất khách hàng");
	System.out.println("3.Tìm khách hàng");
	System.out.println("4.Sắp xếp khách hàng");
	System.out.println("5.Lưu khách hàng");
	System.out.println("6.Đọc khách hàng");
	System.out.println("7.Thông kê theo nhà mạng");
	System.out.println("8.Thoát chương trình");
	System.out.println("9.xoa khach hang");
	choose=new Scanner(System.in).nextInt();
	switch(choose)
	{
	case 1:
		nhapKhachHang();
		break;
	case 2:
		xuatKhachHang();
		break;
	case 3:
		timKhachHang();
		break;
	case 4:
		sapKhachHang();
		break;
	case 5:
		luuKhachHang();
		break;
	case 6:
		docKhachHang();
		break;
	case 7:
		thongKe();
		break;
	case 9:
		xoaKhachHang();
		break;
	case 8:
		exit();
		break;
	}
}
	private static void xoaKhachHang() {
	// TODO Auto-generated method stub
		String xoa=new Scanner(System.in).nextLine();
	for(KhachHang kh:dsKH)
	{
		if(kh.getNumber().startsWith(xoa))
		{
			dsKH.remove(kh);
			if(dsKH==null)
			{
				System.out.println("danh sach trong");
			}
		}
	}
}
	public static void exit() {
	// TODO Auto-generated method stub
		System.out.println("cám ơn vi đã sử dụng");
	System.exit(0);
}
	public static void thongKe() {
	// TODO Auto-generated method stub
		int n=0;
		for(KhachHang kh:dsKH)
		{
			if(kh.getNumber().startsWith("098"))
			{
				n++;
			}
		}
		System.out.printf("co tong cong %d cua viettel ",n);
}
	public static void docKhachHang() {
	// TODO Auto-generated method stub
	dsKH=SerialPactory.docFile("D:\\data1.db");
	System.out.println("doc file thanh cong");
}
	public static void luuKhachHang() {
	// TODO Auto-generated method stub
		boolean kt=SerialPactory.luuFile(dsKH, "D:\\data1.db");
		if(kt==true)
		{
			System.out.println("luu file thanh cong");
		}
		else
			System.out.println("error");
	
}
	public static void sapKhachHang() {
	// TODO Auto-generated method stub
	Collections.sort(dsKH);
	System.out.println(" sap xep thanh cong");
}
	public static void timKhachHang() {
	// TODO Auto-generated method stub
		System.out.println(" Nhap sdt can tim");
		String phone= new Scanner(System.in).nextLine();
		System.out.println("Tên \t Mã \t SĐT");
		for(KhachHang kh:dsKH)
		{
			if(kh.getNumber().startsWith(phone))
			{
				System.out.println(kh);
			}
		}
}
	public static void xuatKhachHang() {
	// TODO Auto-generated method stub
	System.out.println("============================");
	System.out.println("Tên \t Mã \t SĐT");
	for(KhachHang kh:dsKH)
	{
		System.out.println(kh);
	}
	System.out.println("============================");
}
	public static void nhapKhachHang() {
	// TODO Auto-generated method stub
		KhachHang kh=new KhachHang();
		System.out.println("Nhập tên");
		String name= new Scanner(System.in).nextLine();
		System.out.println("Nhập mã");
		String ma=new Scanner(System.in).nextLine();
		System.out.println("Nhập SĐT");
		String number=new Scanner(System.in).nextLine();
	    kh.setMa(ma);
	    kh.setName(name);
	    kh.setNumber(number);
	    dsKH.add(kh);
}
	public static void main(String[] args) {
		while(true)
		{
     Menu();
		}
	}

}
