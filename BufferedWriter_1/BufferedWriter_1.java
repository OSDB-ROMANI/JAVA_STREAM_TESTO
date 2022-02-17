/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedWriter_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class BufferedWriter_1 {

    private BufferedWriter bw;
    
    public BufferedWriter_1(File f) throws IOException{
        bw = new BufferedWriter(new FileWriter(f));
    }

    public BufferedWriter_1(String nome) throws IOException{
        bw = new BufferedWriter(new FileWriter(nome));
    }

    public BufferedWriter_1(FileWriter fr) throws IOException{
        bw = new BufferedWriter(fr);
    }    

    public BufferedWriter_1(File f, boolean a) throws IOException{
        bw = new BufferedWriter(new FileWriter(f,a));
    }

    public BufferedWriter_1(String nome, boolean a) throws IOException{
        bw = new BufferedWriter(new FileWriter(nome,a));
    }

    public void writeFile(String testo) throws IOException {
        bw.write(testo);
    }
    
    public void newLine() throws IOException{
        bw.newLine();
    }

    public void svoltaStream() throws IOException{
        bw.flush();
    }
    
    public void closeFile() throws IOException{
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter_1 bw;

        System.out.println("Scrivi il nome del file: ");
        bw = new BufferedWriter_1(sc.next());
        bw.writeFile("ciao mondo");
        bw.svoltaStream();
        bw.closeFile();
        System.out.println("Nuova riga");
        bw = new BufferedWriter_1(sc.next());
        bw.newLine();
        bw.svoltaStream();
        bw.closeFile();        
        System.out.println("Scrivi il nome del file: ");
        bw = new BufferedWriter_1(new File(sc.next()),true);
        bw.writeFile("ciao mondo");
        bw.svoltaStream();
        bw.closeFile();
    }  
}