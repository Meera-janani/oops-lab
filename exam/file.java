import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Main{
	static String data="";
	public static void main(String[]args){
		try{
			File dataFile=new File("Data.txt");
			Scanner dataRead=new Scanner(dataFile);
			while(dataRead.hasNextLine()){
				data+= dataRead.nextLine();
				data+= "\n";
			}
			dataRead.close();
		}catch(FileNotFoundException ex){
			System.out.println("Error occured");
			}
		try{
			FileWriter dataWriter=new FileWriter("Data2.txt");
			dataWriter.write(data);
			dataWriter.close();
		}catch(IOException ex){
			System.out.println("error occured");
			ex.printStackTrace();
		}
	}
}

