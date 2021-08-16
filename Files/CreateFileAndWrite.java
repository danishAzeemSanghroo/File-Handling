import java.io.*;
import java.io.IOException;
class CreateFileAndWrite{
	public static void main(String args[]){
		try{
	//File f=new File("d:/File Handling/createFile.text");
	//boolean b=f.createNewFile();
	//System.out.println("New File has been created: "+b);
	
	FileOutputStream f1=new FileOutputStream("createFile.txt");
			char ch=65;
			for(int i=0;i<=25;i++){
				f1.write(ch);
				ch++;
				
			}	
			f1.close();
		}catch(IOException e){e.printStackTrace();}
	}
}