public class String_Uppercase {
    public static void main(String[] args) {
    String lowerCaseStr = "hi, i am kartikeya";    
    StringBuilder sb = new StringBuilder("");
    
    Character ch = Character.toUpperCase(lowerCaseStr.charAt(0));
    sb.append(ch);

    for (int i = 1; i < lowerCaseStr.length(); i++) {
        if (lowerCaseStr.charAt(i) == ' ' && i < lowerCaseStr.length() - 1) {
            sb.append(lowerCaseStr.charAt(i));
            i++;
            sb.append(Character.toUpperCase(lowerCaseStr.charAt(i)));
        } else{
            sb.append(lowerCaseStr.charAt(i));
        }
    }
    System.out.println(sb);
    }
}