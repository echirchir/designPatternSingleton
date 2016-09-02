/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsingleton;


//Lazy initialization here; by first checking if instance is null
public class MakeACaptain {
    
    private static MakeACaptain _captain;
    
    private MakeACaptain(){
        //make this private to avoid instance creation
    }
    
    public static synchronized MakeACaptain newInstance(){
        
        if(_captain == null){
            _captain = new MakeACaptain();
            System.out.println("New captain selected for our team");
        }else{
            System.out.println("You already have a captain for your team");
            System.out.println("Send him for the toss!");
        }
        
        return _captain;
    }
    
    // 2 - Eager initialization example class
    public class MakeACaptain{
        private static MakeACaptain _captain = new MakeACaptain();
        
        //make constructor private to prevent use of new keyword
        private MakeACaptain(){}
        
        //now global access point by making our method public & static
        public static MakeACaptain newInstance(){
            return _captain;
        }
    }
    
    //3 - Bill Pugh solution
    public class MakeACaptain{
        private static MakeACaptain _captain;
        
        private MakeACaptain() {}
        
        private static class SingletonHelper{
            //nested class is referenced after newInstance() is called
            
            private static final MakeACaptain _captain = new MakeACaptain();
        }
        
        public static MakeACaptain newInstance(){
            return SingletonHelper._captain;
        }
    }
    
}
