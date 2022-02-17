/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Paolo
 */
public class FileReader_1 {
    private FileReader fd;
    
    public FileReader_1(File f) throws FileNotFoundException{
        fd = new FileReader(f);
    }

    public FileReader_1(String nome) throws FileNotFoundException{
        fd = new FileReader(nome);
    }
    
    public int getFile() throws IOException{
        return fd.read();
    }
   
    public void closeFile() throws IOException{
        fd.close();
    }
    
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    FileReader_1 fr;

    System.out.println("Scrivi il nome del file: ");
    fr = new FileReader_1(sc.next());
    System.out.println(fr.getFile());
    }  
}
