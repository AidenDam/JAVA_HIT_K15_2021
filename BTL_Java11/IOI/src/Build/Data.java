package Build;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data
{
    static String linkData = "C:\\!BTL_Java\\IOI\\src\\Data";
    static String linkDownload = "C:\\Users\\Dung\\Downloads";

    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;
    private static PrintWriter printWriter;

    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public static void init() {
        createFolders(linkData + "\\info");
        createFolder(linkData + "\\Course");
        createFile(linkData + "\\Account.txt");

        Account ac = new Account();
        ac.username = "admin";
        ac.password = "adminOfIOI";
        writeAccountFromFile(ac, 0);
    }

    public static void createFolder(String link) {
        try {
            File file = new File(link);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createFolders(String link) {
        try {
            File file = new File(link);
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String link) {
        try {
            File file = new File(link);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void delFile(String link) {
        try {
            File file = new File(link);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delFolder(String link) {
        File file = new File(link);
        if (file.isDirectory()) {
            String[] files = file.list();
            for (String child : files) {
                File childDir = new File(file, child);
                if (childDir.isDirectory()) {
                    delFolder(childDir.getAbsolutePath());
                } else {
                    childDir.delete();
                }
            }
            if (file.list().length == 0) {
                file.delete();
            }

        } else {
            file.delete();
        }
    }

    public static void moveFile(String oldLink, String newLink) {
        File o = new File(oldLink);
        File n = new File(newLink);
        o.renameTo(n);
    }

    public static void copyFolder(File sourceFolder, File targetFolder) {
        try {
            if (sourceFolder.isDirectory()) {
                if (!targetFolder.exists()) {
                    targetFolder.mkdir();
                }
                String files[] = sourceFolder.list();
                for (String file : files) {
                    File srcFile = new File(sourceFolder, file);
                    File tarFile = new File(targetFolder, file);
                    copyFolder(srcFile, tarFile);
                }
            } else {
                InputStream in = new FileInputStream(sourceFolder);
                OutputStream out = new FileOutputStream(targetFolder);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openFileToWrite(String link, boolean app) {
        try {
            fileWriter = new FileWriter(link, app);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeFileAfterWrite() {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openFileToRead(String link) {
        try {
            fileReader = new FileReader(link);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void closeFileAfterRead() {
        try {
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAccountFromFile(Account ac, int level) {
        try {
            openFileToWrite(linkData + "\\Account.txt", true);
            printWriter.println(ac.getUsername() + ";" + ac.getPassword() + ";" + level + ";" + ac.getCreateAt());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeFileAfterWrite();
        }

        String linkAc = linkData + "\\info\\" + ac.getUsername();
        createFolder(linkAc);
        createFile(linkAc + "\\info.txt");
        if(level == 1) {
            createFile(linkAc + "\\class.txt");
        }

        writeInfo(ac.getUsername(), ac.getInformation());
    }

    public static void writeAccount(List<String> s) {
        try {
            openFileToWrite(linkData + "\\Account.txt", false);
            for (String it : s) {
                printWriter.println(it);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeFileAfterWrite();
        }
    }

    public static void writeInfo(String us, Person p) {
        try {
            openFileToWrite(linkData + "\\info\\" + us + "\\info.txt", false);
            printWriter.println(p.getFirstName() + ";" + p.getLastName() + ";" + p.getAge() + ";" +
                    p.getGender() + ";" + p.getBirthDay() + ";" + p.getPhone() + ";" +
                    p.getEmail() + ";" + p.getLinkFB() + ";" + p.getSummary());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeFileAfterWrite();
        }
    }

    public static List<String> readFile(String link) {
        List<String> list = new ArrayList<>();
        try {
            openFileToRead(link);

            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeFileAfterRead();
        }
        return list;
    }

    public static List<String> readFolder(String link) {
        File fileOrDir = new File(link);
        List<String> list = new ArrayList<>();

        if (fileOrDir.isDirectory()) {
            for(final File file : fileOrDir.listFiles()) {
                list.add(file.getName());
            }
        }
        return list;
    }

    public static List<String> readAccount() {
        return readFile(linkData + "\\Account.txt");
    }

    public static Person readInfo(String us) {
        return new Person(readFile(linkData + "\\info\\" + us + "\\info.txt").get(0).split(";"));
    }

    public static List<String> readClass(String us) {
        return readFile(linkData + "\\info\\" + us + "\\class.txt");
    }

    public static List<String> readCourse() {
        return readFolder(linkData + "\\Course");
    }

    public static String downCourse(String cs) {
        File sourceFolder = new File(linkData + "\\Course\\" + cs);
        File targetFolder = new File(linkDownload + "\\" + cs);
        copyFolder(sourceFolder, targetFolder);

        return linkDownload + "\\" + cs;
    }

    public static void upCourse(String us, String link, String name) {
        File sourceFolder = new File(link);
        File targetFolder = new File(linkData + "\\Course\\" + name + " _ " + us);
        copyFolder(sourceFolder, targetFolder);

        try {
            openFileToWrite(linkData + "\\info\\" + us + "\\class.txt", true);

            printWriter.println(name +  " _ " + us);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeFileAfterWrite();
        }
    }

    public static void openFileByCMD(String link) {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(new String[]{"cmd.exe","/c","start " + link});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}