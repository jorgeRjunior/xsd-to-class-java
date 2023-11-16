package XSD_TO_CLASS;


import java.io.File;
import java.io.IOException;

/**
 * Classe para manipulação de arquivos XSD e execução de comandos.
 * Este método visa criar classes a partird eum schema XSD
 * 
 * 
 * @author [Jorge Ruediger Junior]
 * @version [v1.0]
 */

public class Xsd_to_class 
	{	// caminho onde esta os arquivos XSD

    private static final String FOLDER_PATH = "C:/Users/User/Desktop/XsdFile";
    private static final String XJC_PATH = "xjc ";

    //Caminho para a criação do pacote
    private static final String caminhoPacote = "br.gov.esocial.reinf.schemas.v2_01_02_B.";;

    public static void main(String[] args) {
        processFiles();
    }

    private static void processFiles() {
        File folder = new File(FOLDER_PATH);

        // Verifica se o caminho é uma pasta válida
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("O caminho não é uma pasta válida.");
            return;
        }

        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    handleFile(file);
                }
            }
        }
    }

    private static void handleFile(File file) {
        String fileName = file.getName();
        String folderName = fileName.substring(0, fileName.lastIndexOf("."));

        File newFolder = new File(FOLDER_PATH, folderName);

        // Cria a pasta se não existir
        if (!newFolder.exists() && newFolder.mkdir()) {
            System.out.println("Pasta criada: " + newFolder.getAbsolutePath());
        } else {
            System.out.println("Pasta já existe ou não pôde ser criada: " + newFolder.getAbsolutePath());
        }

        processXjcCommand(file, fileName, newFolder);
    }

    private static void processXjcCommand(File file, String fileName, File newFolder) {
        if (!newFolder.exists() || !newFolder.isDirectory()) {
            System.out.println("Pasta não encontrada: " + newFolder.getAbsolutePath());
            return;
        }

        // Constrói o comando BA
         String command = XJC_PATH + " -d " + newFolder.getName() + " -p. "+ caminhoPacote
                + fileName.replace("-", "").replace(".xsd", "") + " " + fileName;

        try {
            executeCommand(command);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void executeCommand(String command) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "cd " + FOLDER_PATH + " && " + command);
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();
        int exitCode = process.waitFor();

        if (exitCode == 0) {
            System.out.println("Comando executado com sucesso: " + command);
        } else {
            System.out.println("Erro ao executar comando: " + command);
        }
    }
}
