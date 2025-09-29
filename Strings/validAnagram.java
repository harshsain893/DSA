public class validAnagram {
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int count [] = new int [26];

        // Firstly count character in s //
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        // Subtract character in t //
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            count[c - 'a']--;
        }

        // Check if all counts are 0 // 
        for(int i = 0; i < 26; i++){
            if(count[i] != 0) return false;
        }
        return true;
    }
}

