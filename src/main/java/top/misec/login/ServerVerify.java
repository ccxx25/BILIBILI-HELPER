package top.misec.login;

/**
 * @author Junzhou Liu
 * @create 2020/10/21 19:57
 */
public class ServerVerify {

    private static String FTKEY = null;


    private final static ServerVerify SERVER_VERIFYVERIFY = new ServerVerify();

    public static void verifyInit(String ftKey) {
        ServerVerify.FTKEY = ftKey;
    }

    public static String getFTKEY() {
        return FTKEY;
    }

    public static ServerVerify getInstance() {
        return SERVER_VERIFYVERIFY;
    }
}
