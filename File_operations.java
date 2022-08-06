
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
	class Cr1
	{
		 static void Display() throws IOException {
				
				String path="C:\\Users\\Public\\Folder\\";
				File f=new File(path);
				File filenames[]=f.listFiles();
				for(File ff:filenames) {
					System.out.println(ff.getName());
				}
	}
	 static void Create() throws IOException
	{
			String path="C:\\Users\\Public\\Folder\\";
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name of the file");
			String filename=s.next();
			String folderpath;
			folderpath=path+filename;
			File f=new File(folderpath);
			boolean b=f.createNewFile();
			if(b != true)
			{
				System.out.println("File does not exists");
			}
			else
				System.out.println("File exists");
		}
	static void Read1() throws IOException {

		String path="C:\\Users\\Public\\Folder\\";
		System.out.println("Enter the file to be read");
		Scanner b=new Scanner(System.in);
		String name=b.next();
		String finals=path+name;
		System.out.println(finals);
		FileReader f=new FileReader(finals);
		if(f!=null) {
			System.out.println("File exists");
		}
		System.out.println("The contents are:");
		int i=0;
		//-1 is EOF
		while((i=f.read())!=-1){
			System.out.print((char)i);
		}
	
f.close();
	}
	static void Write1() throws IOException{
		Scanner s=new Scanner(System.in);
		String path="C:\\Users\\Public\\Folder\\file2";
		FileWriter f=new FileWriter(path);
		System.out.println("Enter the subject to be written in the file");
		String i=s.nextLine();
		byte b[]= i.getBytes();
		f.write(i);
		System.out.println("The required content is written in the file");
		f.close();
		} 
	static void Search1() throws IOException{
	System.out.println("enter the filename to search");
	Scanner sc=new Scanner(System.in);
	String path ="C:\\Users\\Public\\Folder\\";
	String filename3=sc.next();
	File f=new File(path);
	int flag=0;
	File filenames[]=f.listFiles();
	for(File ff:filenames) {
		if(ff.getName().equals(filename3)) 
		{
			flag=1;
			break;
		}
		else {
			flag=0;
		}
	}
	if(flag==1) {
		System.out.println("file is found");
	}
	else {
		System.out.println("file is not found");

          }
	}
	 static void Del() throws IOException {
			String path="C:\\Users\\Public\\Folder\\";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the filename");
			String filename=sc.next();
			String finalpath=path+filename;
			File f=new File(finalpath);
			//delete operation
			f.delete();
			System.out.println("file gets deleted");
			
		}
}
public class File_operations {
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		Cr1 a=new Cr1();
		while(true) {
			System.out.println("Enter the main switch option:\n 1)display the files\n 2)Goto sub switch case\n 3)exit");
			int option1=s.nextInt();
			switch(option1)
			{
			case 1:a.Display();
			       break;
			case 2:while(true) {
				System.out.println("Enter the option\n" +"Option 1:Create\n"+"Option 2:Read\n"+"Option 3:Write\n"+"Option 4:Search\n"+"Option 5:Delete\n"+"Option 6:Exit\n");
				int option2 =s.nextInt();
				switch(option2)
				{
				case 1:a.Create();break;
				case 2:a.Read1();break;
				case 3:a.Write1();break;
				case 4:a.Search1();break;
				case 5:a.Del();break;
				case 6:System.exit(0);
				}
			}
			case 3:System.exit(0);
		}
	}
	}}

