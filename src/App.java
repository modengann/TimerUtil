//YouTube explanation: https://youtu.be/d5GdrpnMJdc

import java.util.*;
import javadraw.*;


public class App extends Window{
    Oval test;

    //Clickable used to decide if test Oval can be "clicked"
    boolean clickable = true;
    Timer timer;
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        //Initialize and center Oval
        timer = new Timer();
        test = new Oval(screen, 400, 300, 200, 200, Color.RED);
        test.center(400,300);
    }

    public void mouseDown(int button, Location loc){
        //contains checks to see if a Location is inside a JavaDraw object


    
        //Option 1: Changing property after 3 seconds
        //Could be used to change color from one to another then back after X seconds

        if(test.contains(loc)){
            //Makes Oval invisible
            test.visible(false);
            
            TimerTask task = new TimerTask() {
                public void run(){
                    //Makes Oval visible when timer is up
                    test.visible(true);
                }
            };
            //Creates a timer that will run 'task' after 3000 milliseconds (i.e. 3 seconds)
            timer.schedule(task, 3000);
        }
       

        //Option 2: Changes color if clickable is true. Makes 'clickable' false for 3 seconds
        //Could be used to make a hero invincible after being hit by enemy 
        // if(clickable){
        //     test.color(Color.random());
        //     clickable = false;
        //     TimerTask clicky = new TimerTask(){
        //         public void run(){
        //             clickable = true;
        //         }
        //     };
        //     timer.schedule(clicky, 3000);
        // }


        
    }
}
