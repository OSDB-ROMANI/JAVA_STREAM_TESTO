# JAVA_STREAM_FILE_TESTO
<h4>Gestire flussi di caratteri - I/O</h4>

Gli STREAM (flusso) sono una sequenza ordinata di dati che hanno una sorgente (input) o una destinazione (output). Gli stream possono rappresentare molte differenti fonti sorgenti o di destinazione quali file su disco, memoria, dispositivi collegati, altri programmi.
Per poter leggere/scrivere un file o una risorsa occorre utilizzare un oggetto (stream) che si "aggancia" alla risorsa.
<h1>LETTURA FILE DI TESTO</h1>

<h3>FileReader</h3>
Per leggere un file di testo dobbiamo creare un oggetto di tipo FileInputStream collegato al file specificato, prevede due costruttori:
<ol>
  <li>FileReader(String nome)</li>
  <li>FileReader(File f)</li>
</ol>
<h4>Metodi principali</h4>
<ol>
  <li>int read(): restituisce la rappresentazione numerica del carattere letto</li>
  <li>void close(): chiude lo stream alla risorsa associata</li>
</ol>

<h3>BufferedReader</h3>
Serve per leggere un blocco di testo agganciandosi ad uno stream, costruttore:
<ol>
  <li>BufferedReader(String nome)</li>
  <li>BufferedReader(FileReader fr)</li>
</ol>
E' possibile creare un'oggetto: BufferedReader bf = new BufferedReader(new FileReader(nome o File f);
<h4>Metodi principali</h4>
<ol>
  <li>String readLine(): legge una riga fino alla fine e restituisce quando letto codificato come stringa</li>
  <li>void close(): chiude lo stream alla risorsa associata</li>
</ol>
<hr>
<h1>SCRITTURA FILE DI TESTO</h1>
<h3>FileWriter</h3>
Per scrivere un file di testo dobbiamo creare un oggetto di tipo FileWriter collegato al file specificato, prevede diversi costruttori suddivisi in due modalità:
<ol>
  <li>Riscrittura del contenuto nel file specificato, perdo il contenuto esistente:
    <ol>
      <li>FileWriter(File f)</li>
      <li>FileWriter(String nome)</li>
    </ol>
  </li>
  <li>Aggiungere del contenuto nel file specificato, non perdo il contenuto esistente:
    <ol>
      <li>FileWriter(File f, boolean append)</li>
      <li>FileWriter(String nome, boolean append)</li>
    </ol>
  </li>
  </ol>
 Se il valore di append è true aggiunge il contenuto alla fine del file.
<h4>Metodi principali</h4>
<ol>
  <li>void write(String testo): scrive il testo nel file</li>
  <li>void flush(): svuota lo stream</li>
  <li>void close(): chiude lo stream alla risorsa associata</li>
</ol>
NB: Se il file non esiste lo crea.

<h3>BufferedWriter</h3>
Serve per scrivere un blocco di testo agganciandosi ad uno stream, costruttore:
<ol>
  <li>BufferedWriter(File f)</li>
  <li>BufferedWriter(String nome)</li>
  <li>BufferedWriter(FileReader fr)</li>
</ol>
E' possibile creare un oggetto: BufferedReader bf = new BufferedReader(new FileReader(nome o File f);
<h4>Metodi principali</h4>
<ol>
  <li>write(String testo): scrive il testo nel file</li>
  <li>newLine(): crea una riga vuota</li>
  <li>void flush(): svuota lo stream</li>
  <li>void close(): chiude lo stream alla risorsa associata</li>
</ol>
