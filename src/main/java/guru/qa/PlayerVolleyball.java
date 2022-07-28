package guru.qa;

public class PlayerVolleyball {
     int height;
     String name;
     String position;

     public PlayerVolleyball(String name, int height, String position){
            this.height = height;
            this.name = name;
            this.position = position;
     }

    public PlayerVolleyball(String name, String position){
        this.name = name;
        this.position = position;
    }


    void atack(){
        System.out.println(this.name + " выполняет атакующий удар");

    }

    void supply(){
        System.out.println(this.name + " выполняет подачу");
    }

    void suited(){
        System.out.println(this.name + " принимает подачу");
    }

    void pass(){
        System.out.println(this.name + " выполняет передачу");
    }


}
