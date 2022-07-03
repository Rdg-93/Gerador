import java.io.File;
import java.io.IOException;

public class FileGerador {
    public static void main(String[] args) throws IOException {

            File arquivo = new File("/home/rdg/Documentos/Gerado");
            try {
                if (!arquivo.exists()) {
                    arquivo.createNewFile();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        String path = "/home/rdg/Documentos/Gerado";

            ManipuladorArquivo.escritor(path);
    }
}