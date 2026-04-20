public class strcompression {
    public int compress(char[] chars) {
        int index = 0, i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) j++;
            chars[index++] = chars[i];
            if (j - i > 1) {
                for (char c : Integer.toString(j - i).toCharArray()) chars[index++] = c;
            }
            i = j;
        }
        return index;
    }
}
    
    

