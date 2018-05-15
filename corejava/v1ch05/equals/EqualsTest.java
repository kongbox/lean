package equals;

import java.sql.Timestamp;
import java.util.AbstractSet;
import java.util.HashSet;

/**
 * This program demonstrates the equals method.
 * @version 1.12 2012-01-26
 * @author Cay Horstmann
 */
public class EqualsTest
{
   public static void main(String[] args)
   {
      Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
      Employee alice2 = alice1;
      Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
      Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

      System.out.println("alice1 == alice2: " + (alice1 == alice2));

      System.out.println("alice1 == alice3: " + (alice1 == alice3));

      System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));

      System.out.println("alice1.equals(bob): " + alice1.equals(bob));

      System.out.println("bob.toString(): " + bob);

      Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
      Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
//      boss.setBonus(5000);
      Object o1=carl;
      Object o2 =boss;
      Object o3 =alice3;
      System.out.println("boss.toString(): " + boss);
      System.out.println("carl.equals(boss): " + carl.equals(boss));
      System.out.println("alice1.hashCode(): " + alice1.hashCode());
      System.out.println("alice3.hashCode(): " + alice3.hashCode());
      System.out.println("bob.hashCode(): " + bob.hashCode());
      System.out.println("boss.hashCode(): " + boss.hashCode());
      System.out.println("carl.hashCode(): " + carl.hashCode());
      System.out.println("Object.getClass(): " + o1.getClass());
      System.out.println("Object.getClass(): " + o2.getClass());
      System.out.println("Object.getClass(): " + o3.getClass());

      /**
       * abstractSet 类的equals的 类中没有getClass 相等判断
       * •如果子类能够拥有自己的相等概念， 则对称性需求将强制采用getClass 进行检测
       * •如果由超类决定相等的概念，那么就可以使用imtanceof 进行检测， 这样可以在不同子类的对象之间进行相等的比较。
       */
      AbstractSet abstractSet =new HashSet();

      Timestamp timestamp;
   }
}