package sistemabiblioteca;


import cargaarchivo.LineToToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SistemaBiblioteca {


    public static void main(String[] args) {
        LineToToken lineaTokens;
        try (BufferedReader br = new BufferedReader(new FileReader(
                    "/home/w9d1o/Downloads/novelas_500.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineaTokens = new LineToToken(line);
                for (String token: lineaTokens.ListaToken()) {
                    System.out.println(token);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
