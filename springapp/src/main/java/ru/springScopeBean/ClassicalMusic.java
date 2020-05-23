package ru.springScopeBean;

public class ClassicalMusic implements Music {
private ClassicalMusic(){
}
  public static ClassicalMusic getClassicalMusic(){
    return new ClassicalMusic();
    }

    public void doInitMethod(){
        System.out.println("Do my initialization method ");
    }

    public void destroyMyMethod(){
        System.out.println("F*** method ");
    }


    @Override
    public String getMusic() {
        return "Classical music";
    }


}
