class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> mos = new ArrayList<String>();
        for(int i = 0; i < words.length; i++) {
            String t = "";
            for(int j = 0; j < words[i].length(); j++) {
                t += wordToMos(words[i].charAt(j));
            }
            mos.add(t);
        }
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for(int i = 0; i < mos.size(); i++) {
            if(temp.containsKey(mos.get(i))) {
                int count = temp.get(mos.get(i));
                count ++;
                temp.put(mos.get(i), count);
            }else {
                temp.put(mos.get(i), 0);
            }
        }
        int s = temp.size();
        return s;
    }
    public String wordToMos(char word) {
        String t = "";
        switch(word) {
                case 'a' : t = ".-"; break;
                case 'b' : t = "-...";break;
                case 'c' : t = "-.-.";break;
                case 'd' : t = "-..";break;
                case 'e' : t = ".";break;
                case 'f' : t = "..-.";break;
                case 'g' : t = "--.";break;
                case 'h' : t = "....";break;
                case 'i' : t = "..";break;
                case 'j' : t = ".---";break;
                case 'k' : t = "-.-";break;
                case 'l' : t = ".-..";break;
                case 'm' : t = "--";break;
                case 'n' : t = "-.";break;
                case 'o' : t = "---";break;
                case 'p' : t = ".--.";break;
                case 'q' : t = "--.-";break;
                case 'r' : t = ".-.";break;
                case 's' : t = "...";break;
                case 't' : t = "-";break;
                case 'u' : t = "..-";break;
                case 'v' : t = "...-";break;
                case 'w' : t = ".--";break;
                case 'x' : t = "-..-";break;
                case 'y' : t = "-.--";break;
                case 'z' : t = "--..";break;  
        }
        return t;
    }
}



/**
 * class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] basic = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set set = new HashSet();
        for (String word : words) {
            StringBuilder str = new StringBuilder();
            for (char c : word.toCharArray()) {
                str.append(basic[c - 'a']);
            }
            set.add(str.toString());
        }
        return set.size();
    }
}
 */