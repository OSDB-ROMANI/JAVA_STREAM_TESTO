/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferdReader_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class BufferedReader_1 {
    private BufferedReader bf;
    
    public BufferedReader_1(File f) throws FileNotFoundException{
        bf = new BufferedReader(new FileReader(f));
    }

    public BufferedReader_1(String nome) throws FileNotFoundException{
        bf = new BufferedReader(new FileReader(nome));;
    }
    
    public String getLine() throws IOException{
        return bf.readLine();
    }
    
    public String getAllLine() throws IOException{
        String line;
        String testo = "";
        while((line = bf.readLine())!=null){
            testo = testo+line+System.lineSeparator();
        }
        return testo;
    }
    
    public void closeFile() throws IOException{
        bf.close();
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader_1 bf;
        System.out.println("Scrivi il nome del file: ");
        bf = new BufferedReader_1(sc.next());
        System.out.println("\nSingola riga\n"+bf.getLine());
        System.out.println("\nTutto il file\n"+bf.getAllLine());
        bf.closeFile();
    }    
}
