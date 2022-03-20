package sda.java.advanced.basics.exceptions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFinallySample {

    public void readFile(String filename) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // blok finally wykonuje się zawsze, niezależnie od tego
            // czy blok try skończył się poprawnie, czy wystąpił wyjątek
            // i system przeszedł do bloku catch
            // finally wykonuję się PO try / catch
            System.out.println("To się wykona na sam koniec");
            //wyjątek z bloku finally możemy chcieć zwrócić "wyżej" klauzula "throws"
            reader.close();


        }
    }
    // try with resources jako odpowiedź na problematyczną obsługe wyjątków w finally
    public void readFileWithResources(String filename) {
        // try-wtih-resources dostępne od Javy 1.7
        // w klauzuli try() w nawiasie () mamy zdefiniowany zasób
        // dzięki czemu ZAMKNIĘCIE tego zasobu bierze na siebie JAVA
        // czyli reader.close() zostanie wywołane automatycznie bez potrzeby wpisywania tego jawnie w kodzie

        try(BufferedReader reader= new BufferedReader(new FileReader(filename))){
            reader.read();
        } catch(FileNotFoundException e) {
            //łapiemy wyjątek z FileReader
        } catch (IOException e) {
            //łapiemy wyjątek z reader.read()

        }
    }

}
