package Flowchart.SignUp;

public class UserInfo {

    private String storeId;
    private String storePassword;

    private int failCount = 0;
    private boolean locked = false;

    // 회원가입 저장
    public void register (String id, String password) {
        this.storeId = id;
        this.storePassword = password;
    }

    public boolean isLocked() {
        return locked;
    }

    // 로그인 시도
    public boolean login (String inputId, String inputPassword) {
        if(locked) return  false;

        // 아이디, 비번 참/거짓 판별
        boolean ok = storeId != null
                && storePassword != null
                && storeId.equals(inputId)
                && storePassword.equals(inputPassword);

        // 성공 시 실패 횟수 초기화
        if (ok) {
            int failCount = 0;
            return true;
        }

        // 실패 시 카운트
        failCount++;

        if (failCount >= 5) {
            locked = true;
        }
        return false;
    }

    public int getFailCount() {
        return failCount;
    }
}
