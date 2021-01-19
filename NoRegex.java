public class NoRegex {
    public boolean isValidOP(String text){
        if (text == null || text.length() != 8)
            return false;
        text=text.toUpperCase().trim();
        for (int i = 0; i <= 1; i++)
            if (!Character.isLetter(text.charAt(i)))
                return false;
        for (int i = 2; i <= 7; i++)
            if (!Character.isLetterOrDigit(text.charAt(i)))
                return false;
        return true;
    }
}
