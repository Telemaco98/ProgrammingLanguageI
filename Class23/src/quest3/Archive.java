package quest3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import java.lang.Exception;

import java.util.ArrayList;

/**
 * Class for archive.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 18.07.2017
 */
public class Archive {
	private String name;
	private File file;

	/**
	 * Constructs the object Archive.
	 * @param      name  The name of the archive
	 */
	public Archive (String name) {
		this.name = name;
		file = new File(name);
	}

	/**
	 * Read an archive and put the lines in an Array List
	 * @return     lines 	The lines of the archive
	 */
	public ArrayList<String> read() {
		ArrayList<String> lines = new ArrayList<String>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(name));
			String line = reader.readLine();
			
			while(line != null){
				lines.add(line);
				line = reader.readLine();
			}
			reader.close();
			
			return lines;
		} catch (FileNotFoundException e) {
			System.out.println(" O arquivo não foi encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return lines;
	}

	/**
	 * Writes an end of the archive without override.
	 * @param      text  The text
	 */
	public void writeEnd(String text) {
		try {
			FileWriter writer = new FileWriter(name, true);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Writes cleaning the archive, override.
	 * @param      text  The text
	 */
	public void writeCleaning(String text) {
		try {
			FileWriter writer = new FileWriter(name);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Clean the archive
	 */
	public void clean () {
		try {
			FileWriter writer = new FileWriter(name);
			writer.write("");
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}