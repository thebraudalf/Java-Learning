package StringBuffer;

import java.util.Random;

public class GenerateRandom {
    static String generateRandom(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for (int i = 0; i < size; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 20);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
