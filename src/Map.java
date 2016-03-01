import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Map {

	private ArrayList<Brick> bricks = new ArrayList<Brick>(); 
	private String filename;
	
	public Map(String filename){
		this.filename = filename;
		String file = returnFile(filename);
		System.out.println(file);
	}
	
	private String returnFile(String filename){
		String finalString = "";
		try{
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null){
				finalString += line + "\n";
			}
			bufferedReader.close();
		}catch(FileNotFoundException ex){
			System.out.println("Unable to open file '" + filename + "'");
		}catch(IOException ex){
			System.out.println("Error reading file '" + filename + "'");
		}
		return finalString;
	}
	
	private ArrayList<Brick> getBricks(){
		ArrayList<Brick[]> finalBricks = new ArrayList<Brick[]>();
		
		return finalBricks;
	}
	
}
