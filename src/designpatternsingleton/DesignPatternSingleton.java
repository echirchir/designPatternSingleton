
package designpatternsingleton;

public class DesignPatternSingleton {

    
    public static void main(String[] args) {
       
        System.out.println("Beginning of Singleton demo code for design patterns");
        
        MakeACaptain captainOne = MakeACaptain.newInstance();
        
        System.out.println("Trying to make another captain for the team");
        
        MakeACaptain captainTwo = MakeACaptain.newInstance();
        
        if(captainOne == captainTwo){
            System.out.println("CaptainOne and CaptainTwo are the same instance. ");
        }
         
    }
    
}
