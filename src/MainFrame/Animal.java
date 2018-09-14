package MainFrame;

public class Animal {

    public String type;
    public String prey[];


    public void Animal(String type, String prey []){
        this.type = type;

        int n = prey.length;

        this.prey = new String[n];

        for (int i =0; i< n;i++) {
            this.prey[i] = prey[i];
        }
    }
}
