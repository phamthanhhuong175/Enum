package phamthanhhuong.com.test;

import java.util.ArrayList;

import phamthanhhuong.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		ArrayList<SinhVien>dsSV=new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1,"Tèo",6));
		dsSV.add(new SinhVien(2,"Tý",9));
		dsSV.add(new SinhVien(3,"Bin",2));
		dsSV.add(new SinhVien(4,"Bo",7));
		for (SinhVien sv:dsSV)
		{
			System.out.println(sv);
		}
	}

}
