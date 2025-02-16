import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String filePath = "src\\TFW (That Feeling When).wav";
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = Play\nS = Stop\nR = Reset\nQ = Quit");
                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        finally {
            System.out.println("Bye!");
            scanner.close();
        }

    }
}
