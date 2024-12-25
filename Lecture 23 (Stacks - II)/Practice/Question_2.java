import java.util.*;

public class Question_2 {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.isEmpty() || component.equals(".")) {
                // Ignore empty components and current directory symbol
                continue;
            } else if (component.equals("..")) {
                // Pop the stack to go up one level, if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push valid directory names onto the stack
                stack.push(component);
            }
        }

        // Reconstruct the simplified path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        // Return "/" if stack is empty (root directory)
        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(simplifyPath("/apnacollege/")); // Output: /apnacollege
        System.out.println(simplifyPath("/a/.."));         // Output: /
        System.out.println(simplifyPath("/../"));          // Output: /
        System.out.println(simplifyPath("/home/./user/")); // Output: /home/user
    }
}


