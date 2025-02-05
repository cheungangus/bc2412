

public class RoleTest {
    public static void main(String[] args) {
        // 創建角色
        Role r1 = new Role("喬峰",100,'男',"");
        Role r2 = new Role("鳩摩智" , 100,'男',"");

        // 展示角色信息
        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();
        System.out.println();


        while(true){
            //r1開始攻擊r2
            r1.attack(r2);
            //判斷r2血量
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O" + r2.getName());
                break;
            }
            //r2開始攻擊r1
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O" + r1.getName());
                break;
            }
        }
    }
}
