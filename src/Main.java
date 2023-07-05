import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        //FIRST INPUT, AMOUNT OF TITANS AND SIZE OF THE WALLS

        String[] nx;
        nx = s.readLine().split(" ");

        int amountOfTitans = Integer.parseInt(nx[0]);
        int sizeOfWalls = Integer.parseInt(nx[1]);

        //SECOND INPUT, TITANS SIZE

        char[] titansSize = s.readLine().toCharArray();

        //THIRD INPUT, SIZE OF CHARS

        String[] sizeOfCharacters;
        sizeOfCharacters = s.readLine().split(" ");

        int P = Integer.parseInt(sizeOfCharacters[0]);
        int M = Integer.parseInt(sizeOfCharacters[1]);
        int G = Integer.parseInt(sizeOfCharacters[2]);


        s.close();
        //RESOLUTION

        int[] titansSizeTranslate = new int[titansSize.length];
        for (int i = 0; i < titansSize.length ; i++) {
            if(titansSize[i] == 'P'){
                titansSizeTranslate[i] = P;
            }else if(titansSize[i] == 'M'){
                titansSizeTranslate[i] = M;
            }else if(titansSize[i] == 'G'){
                titansSizeTranslate[i] = G;
            }
        }

        List<Integer> currentWalls = new LinkedList<>();
        currentWalls.add(sizeOfWalls);

        for (int i = 0; i < amountOfTitans; i++) {

                for (int j = 0; j < currentWalls.size(); j++) {

                        if (currentWalls.get(j) >= titansSizeTranslate[i]) {
                            currentWalls.set(j,(currentWalls.get(j) - titansSizeTranslate[i]));
                            break;
                        } else if (currentWalls.get(j) < titansSizeTranslate[i] && j == currentWalls.size()-1) {
                            currentWalls.add(sizeOfWalls);
                            if(currentWalls.get(j+1) >= titansSizeTranslate[i]){
                                currentWalls.set(j+1,(currentWalls.get(j+1) - titansSizeTranslate[i]));
                                break;
                            }
                        }

                }


        }

        System.out.println(currentWalls.size());

    }
}