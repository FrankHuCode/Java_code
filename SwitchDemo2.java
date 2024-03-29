package com.itheima.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //目标：学会使用switch语句解决问题，并理解其流程
        //需求：根据星期日期做一个备忘录
        String weekday="周三";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;

            case "周二":
                System.out.println("请求大佬程序员帮忙");
                break;

            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;

            case "周四":
                System.out.println("主动帮助新来的小姐姐解决bug");
                break;

            case "周五":
                System.out.println("今晚吃鸡");
                break;

            case "周六":
                System.out.println("与王阿姨介绍的小芳相亲");
                break;

            case "周日":
                System.out.println("郁郁寡欢，准备上班");
                break;

            default:
                System.out.println("数据有误！");
                break;

        }
    }
}
//Switch 分支注意事项：
//1.表达式类型只能是以下整型：byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。
//2.case 给出的值不允许重复，且只能是字面量，不能是变量
//3.不要忘记写break，否则会出现穿透现象。
