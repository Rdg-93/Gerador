import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        int tel = 911111111;
        for (int i = 0;i<99999999;i++) {
            tel++;
            buffWrite.append("11" + tel +"\n");
        }
        buffWrite.close();
    }

}
