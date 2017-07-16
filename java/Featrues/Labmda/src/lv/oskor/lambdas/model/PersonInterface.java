package lv.oskor.lambdas.model;

/**
 * Created by Oleg Skorobogatov on 09.05.2017.
 */
public interface PersonInterface {
    public String getName();
    public int getAge();

    default String getPersonInfo() {
        return getName()+"(" + getAge()+")";
    }
}
