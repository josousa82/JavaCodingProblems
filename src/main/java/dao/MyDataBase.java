package dao;

public class MyDataBase {

    String testFail;
    String testPass;

    public MyDataBase(String testFail, String testPass) {
        this.testFail = testFail;
        this.testPass = testFail;
    }

    public String getTestFail() {
        return testFail;
    }

    public void setTestFail(String testFail) {
        this.testFail = testFail;
    }

    public String getTestPass() {
        return testPass;
    }

    public void setTestPass(String testPass) {
        this.testPass = testPass;
    }

}
