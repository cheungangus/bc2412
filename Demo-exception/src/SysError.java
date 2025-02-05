public enum  SysError {
    INVALID_USERNAME("Invalid User Name.")
    ,//
    INVALID_PASSWORD("Invalid Password"),
    ;

    private String desc;

    private SysError(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return this.desc;
    }
}
