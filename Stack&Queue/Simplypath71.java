package Stack&Queue;

public class Simplypath71 {
    class Solution {
        public String simplifyPath(String path) {

            Stack<String> stack = new Stack<>();

            String[] parts = path.split("/");

            for (String part : parts) {

                // Current directory or multiple slashes
                if (part.equals("") || part.equals(".")) {
                    continue;
                }

                // Parent directory
                else if (part.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }

                // Valid directory/file name
                else {
                    stack.push(part);
                }
            }

            // Build canonical path
            StringBuilder result = new StringBuilder();

            for (String dir : stack) {
                result.append("/").append(dir);
            }

            // If stack is empty, path is root
            if (result.length() == 0) {
                return "/";
            }

            return result.toString();
        }
    }
}
