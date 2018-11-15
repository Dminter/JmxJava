package jmxjava.base.reflect_;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Client {
        public static void main(String[] args) {

            User user = new User();
            user.setAge(27);
            user.setName("jmx");
//            user.say();
            user.info();


            Class mClass = User.class;
             System.out.println(mClass.getName());

            //获取所有本类声明的变量（不问访问权限）
//            Field fields[] = mClass.getDeclaredFields();
            // 获取所有 public 访问权限的变量
            // 包括本类声明的和从父类继承的
            Field fields[] = mClass.getFields();
            for (Field field:fields
                 ) {
                int modifiers = field.getModifiers();
                System.out.print(Modifier.toString(modifiers) + " ");
                //输出变量的类型及变量名
                System.out.println(field.getType().getName()
                        + " " + field.getName());
            }


             System.out.println("----------methods-----------");
            /**
             * 获取所有 public 访问权限的方法
                包括自己声明和从父类继承的
             */
//            Method methods[] = mClass.getMethods();
            /**
             *获取所有本类的的方法（不问访问权限）
             */
            Method methods[] = mClass.getDeclaredMethods();
            for (Method method :
                    methods) {
                //获取并输出方法的访问权限（Modifiers：修饰符）
                int modifiers = method.getModifiers();
                System.out.print(Modifier.toString(modifiers) + " ");
                //获取并输出方法的返回值类型
                Class returnType = method.getReturnType();
                System.out.print(returnType.getName() + " "
                        + method.getName() + "( ");
                //获取并输出方法的所有参数
                Parameter[] parameters = method.getParameters();
                for (Parameter parameter:
                        parameters) {
                    System.out.print(parameter.getType().getName()
                            + " " + parameter.getName() + ",");
                }
                //获取并输出方法抛出的异常
                Class[] exceptionTypes = method.getExceptionTypes();
                if (exceptionTypes.length == 0){
                    System.out.println(" )");
                }
                else {
                    for (Class c : exceptionTypes) {
                        System.out.println(" ) throws "
                                + c.getName());
                    }
                }
            }

            /**
             *访问私有方法
             */

            try {
                Method sumMethod = mClass.getDeclaredMethod("sum",int.class,int.class);
                /**
                 *java.lang.IllegalAccessException: Class jmxjava.base.reflect_.Client can not access a member of class jmxjava.base.reflect_.User with modifiers "private"
                 */
               /**
                *java.lang.IllegalArgumentException: object is not an instance of declaring class
                */
                sumMethod.setAccessible(true);
                /**
                 *a+b:12
                 */
                sumMethod.invoke(user,1,2);



                /**
                 *修改属性值
                 */

                 System.out.println(user.getName());
                 Field fieldName = mClass.getDeclaredField("name");
                 if (fieldName!=null){
                     fieldName.setAccessible(true);
                     fieldName.set(user,"ZSJ");
                      System.out.println(user.getName());
                 }

                 /**
                  *修改final--不可修改还是原来的值，但是不会报错
                  */
                System.out.println(user.y);
                Field fieldY = mClass.getDeclaredField("y");
                if (fieldY!=null){
                    fieldY.setAccessible(true);
                    fieldY.set(user,90);
                    System.out.println(user.y);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }


        }
}
