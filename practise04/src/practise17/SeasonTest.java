package practise17;

import practise19.MyAnnotation;

/**1.类的对象只有有限个，确定的，我们将其称为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 *
 * values()方法，返回枚举类型的对象数组
 * valueOf()方法，返回一个字符串对应的枚举对象
 *
 * @author LiuJun
 * @create 2021-10-17-14:05
 */
@MyAnnotation(value="hello")
public class SeasonTest {
    public static void main(String args[]){
        Season season1=Season.SPRING;
        System.out.println(season1);
        Season[] values=Season.values();
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }


    }
}

enum Season {
    //提供当前枚举类的对象，中间用逗号，尾部用分号
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "大雪纷飞");
    //声明对象的属性:private final
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


}