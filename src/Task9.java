import java.io.*;

public class Task9 {
    public static void main(String[] args) {
        Box box1 = new Box(4, 2, 3);
        Box box2 = new Box(2, 8, 4);
        Box box3 = new Box(4, 2, 3);
        Box box4 = new Box(1, 4, 3);
        Box box5 = new Box(2, 5, 2);
        try {
            FileOutputStream fos =
                    new FileOutputStream("/Users/maria/Documents/Java/hw4/src/forBox.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(box1);
            oos.writeObject(box2);
            oos.writeObject(box3);
            oos.writeObject(box4);
            oos.writeObject(box5);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

