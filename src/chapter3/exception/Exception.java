package chapter3.exception;

public class Exception {
    public void exceptId(String id, int pw) throws java.lang.Exception {
        if(!id.equals("admin") || ! (pw == 1234)) {
            throw new java.lang.Exception("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }
}
