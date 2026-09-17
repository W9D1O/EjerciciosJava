package sistemabiblioteca;


import cargaarchivo.LineToToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SistemaBiblioteca {

    public static void main(String[] args) {
        LineToToken lineaTokens;
        Biblioteca biblioteca = new Biblioteca();
        try (BufferedReader br = new BufferedReader(new FileReader(
                "/home/w9d1o/Downloads/novelas_500.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineaTokens = new LineToToken(line);
                biblioteca.cargaLibro(new Libro(lineaTokens.ListaToken().get(0),
                lineaTokens.ListaToken().get(2),lineaTokens.ListaToken().get(1)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        biblioteca.imprimirInfoStock("978-5-782-63528-0");
    }

}
