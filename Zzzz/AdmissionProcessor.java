package Zzzz;

public class AdmissionProcessor {

    public static String formatName(String rawName) {
        String[] trimmed = rawName.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < trimmed.length; i++) {
            if (i > 0) sb.append(" ");

            String firstLetter = trimmed[i].substring(0,1).toUpperCase();
            String restLetter = trimmed[i].substring(1).toLowerCase();
            sb.append(firstLetter).append(restLetter);
        }
        return sb.toString();
    }

    public static boolean isValidEmail(String email) {
        if (email.isEmpty()) return false;

        String trimmmedEmail = email.trim();
        int atIndex = trimmmedEmail.indexOf("@");
        int atLastIndex = trimmmedEmail.lastIndexOf("@");
        //If '@' fount at <= index or any duplicate then return false
        if (atIndex <= 0 || atIndex != atLastIndex) return false;

        // Local part must not end with a dot
        if (trimmmedEmail.charAt(atIndex - 1) == '.') return false;

        // Domain must not start with a dot
        if (trimmmedEmail.charAt(atIndex + 1) == '.') return false;
        return true;
    }

    public static String generateReport(String name, String email) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Admission Report ===").append("\n");
        sb.append("Name: ").append(formatName(name)).append("\n");
        sb.append("Email: ").append(email.trim()).append("\n");
        String domain = email.substring(email.indexOf("@") + 1);
        String type = domain.equalsIgnoreCase("iic.edu.np") ? "Internal" : "External";
        sb.append("Domain: ").append(domain).append(" (").append(type).append(" )").append("\n");

        String status = isValidEmail(email) ? "Valid" : "Invalid";
        sb.append("Status: ").append(status).append("\n");
        return sb.toString();
    }

    public static String checkPasswordStrength(String password) {
        int point = 0;
        if (password.length() >= 8) {
            point++;
        }
        boolean  isUpper = false, isLower = false, isDigit = false, isSpecial = false;
        String special = "!@#$%ˆ&*";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) isUpper = true;
            if (Character.isLowerCase(ch)) isLower = true;
            if (Character.isDigit(ch)) isDigit = true;
            if (special.indexOf(ch) >= 0) isSpecial = true;
        }
        if (isUpper) point++;
        if (isLower) point++;
        if (isDigit) point++;
        if(isSpecial) point++;

        String result = (point <= 2) ? "Weak" : (point <= 4) ? "Medium" : "Strong";
        return result ;
    }

    public static String processAdmission(String name, String email, String password) {
        String domain = email.substring(email.indexOf("@") + 1);
        String type = domain.equalsIgnoreCase("iic.edu.np") ? "Internal" : "External";
        String emailStatus = isValidEmail(email) ? "Valid" : "Invalid";

        String strength = checkPasswordStrength(password);
        boolean isStrongEnough = !strength.equals("Weak");

        boolean approved = isValidEmail(email) && isStrongEnough;
        String decision = approved ? "APPROVED" : "REJECTED";
        StringBuilder sb = new StringBuilder();

        sb.append("=== Admission Report ===").append("\n");
        sb.append("Name: ").append(formatName(name)).append("\n");
        sb.append("Email: ").append(email).append("     (").append(emailStatus).append(",").append(type).append(")\n");
        sb.append("Password: ").append(password).append("       (").append(strength).append(")\n");
        sb.append("Decision: ").append(decision).append("\n");

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(processAdmission("Suvam GUrung", "gurungusvam265@gmail.com", "Pokhara,2040"));
    }
}
