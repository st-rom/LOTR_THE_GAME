public abstract class Character {
    protected int power = 10;
    protected int hp = 10;
    public void kick(Character c){ }
    public boolean isAlive(){
        return hp > 0;
    }

    public int getHP(){
        return hp;
    }

    public void setHP(int damage){
        hp -= damage;
    }

    public void death(){
        hp = 0;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int damage){
        power -= damage;
        if(power < 0){
            power = 0;
        }
    }
}
