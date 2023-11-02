package Tugas;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal(){
        switch (this.level){
            case 1:
                this.health += (this.health * 0.3);
                break;
            case 2:
                this.health += (this.health * 0.4);
                break;
            case 3:
                this.health += (this.health * 0.5);
                break;
        }
    }
    public void destroyed(){
        this.health -= (this.health * 0.091);
        //Jika menurut Jobsheet maka hasilnya salah
        // this.health -= (this.health * 0.1);
    }
    @Override
    public String getZombieInfo(){
        String info = "Jumping Zombie Data = \n";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}
