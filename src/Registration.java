import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    private String login;
    private String password;
    private String confirmPassword;

    public Registration(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
//    String exp = "\\s";
//    Pattern pattern = Pattern.compile(exp);
//    Matcher matcher = pattern.matcher(login);
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(confirmPassword, that.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, confirmPassword);
    }

    public static boolean registration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length()>=20 || login.contains(" ")){
            throw new WrongLoginException("Длина login должна быть меньше 20 символов и не должен содержать пробелы.");
        } if(password.length()>=20 || !password.equals(confirmPassword) || password.contains(" ") || !password.matches(".*\\d.*")){
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен\n" +
                    "содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.");
        } else{
            return true;
        }
    }
}
