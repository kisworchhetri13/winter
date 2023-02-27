/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileHandling;

import java.io.*;

/**
 *
 * @author nitro 5
 */
public class AllExample {

 // Creating File in file handling    
    public void creatingFile(){
       File file = new File("kiswor.txt");
       try{
           file.createNewFile();
           System.out.println("File Created Successfully");
           
       }catch(IOException e){
           e.printStackTrace();
           
       }
    }
    
  // writing in file in file handling
    public void writingFile(){
        FileWriter filewriter; 
        try{
            filewriter = new FileWriter("kiswor.txt");
            filewriter.write("This is my new beggining");
            filewriter.close();
            System.out.println("Written in File Successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
  // reading file from file handling
    public void readingFile(){
        try{
        File file = new File("kiswor.txt");
        BufferedReader filereader = new BufferedReader(new FileReader(file));
        String readFile;
        if((readFile= filereader.readLine())!=null){
            System.out.println(readFile);
        }
          
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
  // deleting file in file handling
    public void deletingFile(){
        File file = new File("kiswor.txt");
        file.delete();
        System.out.println("File Deleted Successfully");
    }
    
    public static void main(String[] args) {
        AllExample obj = new AllExample();
        obj.creatingFile();
        obj.writingFile();
        obj.readingFile();
        obj.deletingFile();
    }
    
}
