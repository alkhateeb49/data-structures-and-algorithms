package stringHashtable;

import java.util.ArrayList;

public class LeftJoin {
    public String[][] leftJoin(Hashtable<String, String> hashInput1, Hashtable<String, String> hashInput2) {
        String[][] outputArray;

        if (hashInput1 == null) {
            return null;
        }

        outputArray = new String[hashInput1.entryCount][3];
        ArrayList<String> hashInput1Keys = hashInput1.getKeys();

        for (int i = 0; i < hashInput1Keys.size() ; i++) {
            outputArray[i][0] = hashInput1Keys.get(i);
            outputArray[i][1] = hashInput1.get(hashInput1Keys.get(i));

            if (hashInput2.contains(hashInput1Keys.get(i))) {
                outputArray[i][2] = hashInput2.get(hashInput1Keys.get(i));
            }
            else {
                outputArray[i][2] = null;
            }
        }

        return outputArray;
    }
}