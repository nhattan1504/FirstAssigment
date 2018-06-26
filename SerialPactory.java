package topica.io;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import topica1.model.KhachHang;

public class SerialPactory {
	public static boolean luuFile(ArrayList<KhachHang>dsKH,String path)
	{
		try
		{
			FileOutputStream nos=new FileOutputStream(path);
		    ObjectOutputStream yos=new ObjectOutputStream(nos);
		    yos.writeObject(dsKH);
		    yos.close();
		    nos.close();
		    return true;
		}
		catch(Exception ex)
		{ex.printStackTrace();};
		return false;
	}
	public static ArrayList<KhachHang>docFile(String path)
	{
	
		ArrayList<KhachHang> dsKH=new ArrayList<KhachHang>();
		try
		{
			FileInputStream pos=new FileInputStream(path);
			ObjectInputStream xos=new ObjectInputStream(pos);
			Object data=xos.readObject();
			dsKH=(ArrayList<KhachHang>)data;
			xos.close();
			pos.close();
		}
		catch(Exception ex)
		{ex.printStackTrace();};
		return dsKH;
	}
}