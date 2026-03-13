import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(20, 10, 10, 15);
        double percentage = 0.0;

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        for(int i = 0; i < 1000000; i++)
        {
            //make randomizing scripts
            int len = (int) (Math.random() * 41) + 1;
            int wid = (int) (Math.random() * 6) + 1;
            int xCoord = (int) (Math.random() * 51) + 1;
            int yCoord = (int) (Math.random() * 51) + 1;

            Rectangle temp = new Rectangle(len, wid, xCoord, yCoord);

            if(temp.collidesBottom())
            {
                percentage ++;
            }
            else if(temp.collidesTop())
            {
                percentage ++;
            }
            else if(temp.collidesLeft())
            {
                percentage ++;
            }
            else if(temp.collidesRight())
            {
                percentage ++;
            }

        }
    }
}