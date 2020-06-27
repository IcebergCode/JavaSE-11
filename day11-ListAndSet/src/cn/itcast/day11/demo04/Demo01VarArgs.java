package cn.itcast.day11.demo04;
/*
* 可变参数：是JDK 1.5+之后出现的
* 使用前提：
*       当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
* 使用格式：（定义方法时使用）
*       修饰符 返回值类型 方法名(数据类型...变量名){}
* 可变参数的原理：
*       可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
*       传递的参数个数，可以是0个（不传递），1，2，...，多个
* */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i1 = add();
        int i2 = add(10);
        int i3 = add(10, 20);
        System.out.println(i1); //0
        System.out.println(i2); //10
        System.out.println(i3); //30

        method("abc", 1.6, 1, 1,2,3,4,5);

//        System.out.println(i);
    }

    /*
    * 定义计算（0-n）整数和的方法
    * 已知：计算整数的和，数据类型已经确定int
    * 但是参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
    * add();    就会创建一个长度为0的数组  new int[0];
    * add();    就会创建一个长度为1的数组  new int[] {10};
    * add();    就会创建一个长度为2的数组  new int[] {10, 20};
    * */
    public static int add(int...arr){
//        System.out.println(arr);    //[I@50cbc42f、[I@75412c2f、[I@282ba1e - 底层是一个数组
//        System.out.println(arr.length); //0、1、2

        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        //遍历数组，获取数组中每一个元素
        for (int i : arr) {
            sum += i;
        }
        //把求和结果返回
        return sum;
    }

    /*
    * 可变参数的注意事项
    *       1、一个方法的参数列表，只能由一个可变参数
    *       2、如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
    * */
//    public static void method(int...a, String...b){   //报错
//
//    }

//    public static void method(int...a, String b, double c, int d){    //报错
//
//    }
    public static void method(String b, double c, int d,int...a){   //正确

    }

    //可变参数的特殊(终极)写法
    public static void method1(Object...obj){

    }

}
