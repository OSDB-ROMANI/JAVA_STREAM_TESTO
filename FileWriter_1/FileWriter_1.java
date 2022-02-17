/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWriter_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class FileWriter_1 {
    private FileWriter fw;
    
    public FileWriter_1(File f) throws IOException{
        fw = new FileWriter(f);
    }

    public FileWriter_1(File f,boolean a) throws IOException{
        fw = new FileWriter(f,a);
    }
    
    public FileWriter_1(String nome) throws IOException{
        fw = new FileWriter(nome);
    }

    public FileWriter_1(String nome, boolean a) throws IOException{
        fw = new FileWriter(nome, a);
    }
    
    public void writeFile(String testo) throws IOException {
        fw.write(testo);
    }

    public void svoltaStream() throws IOException{
        fw.flush();
    }
    
    public void closeFile() throws IOException{
        fw.close();
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter_1 fw;

        System.out.println("Scrivi il nome del file: ");
        fw = new FileWriter_1(sc.next());
        fw.writeFile("ciao mondo");
        fw.svoltaStream();
        fw.closeFile();

        System.out.println("Scrivi il nome del file: ");
        fw = new FileWriter_1(sc.next(),true);
        fw.writeFile(System.lineSeparator()+"ciao mondo");
        fw.svoltaStream();
        fw.closeFile();
    }  
}
