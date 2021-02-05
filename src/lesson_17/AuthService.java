package lesson_17;

public abstract class AuthService {
    abstract String getNicknameByLoginAndPassword(String login, String password);
    abstract boolean registration(String login, String password, String nickname);

    boolean changeNick(String oldNickname, String newNickname) {
        return false;
    }
}
