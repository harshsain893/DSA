package Strings;
public class outermostParentheses {
    
    public String removeOuterParentheses(String s) {
        // StringBuilder is used because it's more efficient for building strings
        StringBuilder result = new StringBuilder();
        
        // openCount keeps track of how many '(' are currently open
        int openCount = 0;

        // Loop through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Current character

            if (ch == '(') {
                // If openCount > 0, it means this '(' is NOT the outermost one
                // so we add it to result
                if (openCount > 0) {  
                    result.append(ch);
                }
                // Increase openCount since we found an opening bracket
                openCount++;
            } else { // ch == ')'
                // First decrease openCount because we are closing a bracket
                openCount--;
                
                // If still openCount > 0, it means this ')' is not the outermost
                // so we add it to result
                if (openCount > 0) {   
                    result.append(ch);
                }
            }
        }

        // Return the final string after removing outermost parentheses
        return result.toString();
    }
}
