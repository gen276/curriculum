package check;

import constants.Constants;

public class Check{
    private static String firstName = "峯松";
    private static String lastName = "拳大";

        private static void printName() {
            System.out.println("printNameメソッド" + " " + "→" + " " + firstName + lastName);
        }
        
        public static void main(String[] args) {
        
        Pet p = new Pet(Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
        RobotPet r = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
        
        printName();
        p.introduce();
        r.introduce();
        
    }
}