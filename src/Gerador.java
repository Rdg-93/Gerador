import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gerador {
    public static void main(String[] args) throws IOException {

        String local = "/home/rdg/Documentos/Gerado";

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(local));
        int tel = 911111111;
        for (int i = 0;i<99999999;i++) {
            buffWrite.append("11" + tel + i + "\n");
        }
        buffWrite.close();
    }
}
