package main.java.homework.homework3;

import java.io.FileWriter;

public class LogFile {
    private StringBuilder sb = new StringBuilder();
    public void saveToFile(String string){
        this.sb.append(string + "\n");
        try(FileWriter fw = new FileWriter("D:\\oopJava\\gbproj\\src\\main\\java\\homework\\homework3\\logFile.txt", false))
        {
            fw.write(this.sb.toString());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
