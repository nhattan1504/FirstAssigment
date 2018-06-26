package topica.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import topica1.model.KhachHang;

public class Pactory {
public static boolean luuFile(ArrayList<KhachHang>dsKH,String path)
    {
	try
	{
		FileOutputStream yos=new FileOutputStream(path);
		OutputStreamWriter dos=new OutputStreamWriter(yos, "UTF-8");
		BufferedWriter mos=new BufferedWriter(dos);
		for(KhachHang ds:dsKH)
		{
			String line=ds.getName()+";"+ds.getMa()+";"+ds.getNumber();
			mos.write(line);
			mos.newLine();
		}
		mos.close();
		dos.close();
		yos.close();
		return true;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	return false;
	}
public static ArrayList<KhachHang>docFile(String path)
{
	ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
	try
	{
		FileInputStream tos=new FileInputStream(path);
		InputStreamReader jos=new InputStreamReader(tos, "UTF-8");
		BufferedReader kos=new BufferedReader(jos);
		String line=kos.readLine();
		while(line!=null)
		{
			String []arr=line.split(";");
			if(arr.length==3)
			{
				KhachHang kh=new KhachHang(arr[0],arr[1],arr[2]);
				dsKH.add(kh);
			}
			line=kos.readLine();
		}
		kos.close();
		jos.close();
		tos.close();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	return dsKH;
}
}
